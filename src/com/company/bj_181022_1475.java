package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_181022_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();

        int[] flag = new int[9];

        for(int i=0; i<num.length(); i++){
            int nc = num.charAt(i)-'0';
            if(nc == 9) nc = 6;
            flag[nc]++;
        }

        int max    = 0;
        int maxVal = flag[0];
        for(int i=0; i<8; i++){
            if(maxVal < flag[i+1]){
                max = i+1;
                maxVal = flag[i+1];
            }
        }
        if(max == 6){
            if(maxVal%2 == 0){
                maxVal = maxVal/2;
            }else{
                maxVal = maxVal/2 + 1;
            }
        }

        System.out.println(maxVal);
    }
}
