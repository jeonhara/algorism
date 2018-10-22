package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class bj_181019_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(st.nextToken());
        int i=1, j=0, sum=0;

        while(true){
            if(j != 0) i = j*6;
            sum += i;
            if(sum >= num) break;
            j++;
        }
        bw.write(String.valueOf(j+1));
        bw.flush();
        bw.close();
    }
}
