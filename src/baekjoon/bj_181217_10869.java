package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj_181217_10869 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(a+b+"\n");
        bw.write(a-b+"\n");
        bw.write(a*b+"\n");
        bw.write(a/b+"\n");
        bw.write(a%b+"");
        bw.flush();
        bw.close();
    }
}
