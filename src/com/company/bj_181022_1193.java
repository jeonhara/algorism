package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_181022_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int i=0, sum=0, j=0;

        while(true){
            i++;
            sum += i;
            if(sum > num) break;
        }
        j = sum-i+1;//num-j+1
        System.out.println((num-j+i)+"/"+(i-num+j));
    }
}