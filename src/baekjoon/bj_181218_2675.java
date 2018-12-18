package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj_181218_2675 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j=0; j<s.length(); j++){
                for(int k=0; k<t; k++){
                    bw.write(s.charAt(j)+"");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
