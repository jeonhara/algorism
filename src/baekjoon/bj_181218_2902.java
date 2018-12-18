package baekjoon;

import java.io.*;

public class bj_181218_2902 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = str.split("-");
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i].charAt(0)+"");
        }
        bw.flush();
        bw.close();
    }
}
