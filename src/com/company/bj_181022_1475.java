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
        int[] flag = new int[10];
        for(int i=0; i<10; i++){
            flag[i] = 1;
        }

        int sum = 1;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i)-'0' == 6 || num.charAt(i)-'0' == 9){
                if(flag[num.charAt(i)-'0'] == 1){
                    flag[num.charAt(i)-'0'] = 0;
                }else{
                    if(num.charAt(i)-'0' == 6 && flag[9] == 1){
                        flag[9] = 0;
                    }else if(num.charAt(i)-'0' == 9 && flag[6] == 1){
                        flag[6] = 0;
                    }else{
                        sum++;
                        if(num.charAt(i)-'0' == 6){
                            flag[9] = 1;
                        }else{
                            flag[6] = 1;
                        }
                    }
                }
            }else{
                if(flag[num.charAt(i)-'0'] == 1){
                    flag[num.charAt(i)-'0'] = 0;
                }else{
                    sum++;
                    for(int j=0; j<10; j++){
                        flag[j] = 1;
                    }
                    flag[num.charAt(i)-'0'] = 0;
                }
            }
        }
        System.out.println(sum);
    }
}
