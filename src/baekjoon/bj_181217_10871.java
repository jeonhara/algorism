package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj_181217_10871 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int j = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<j; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num < max){
                bw.write(num+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
