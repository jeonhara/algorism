package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj_181019_15552 {

    // BufferedReader, BufferedWriter참고 - http://snacky.tistory.com/10
    // 문제 - https://www.acmicpc.net/problem/15552

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(num1+num2)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
