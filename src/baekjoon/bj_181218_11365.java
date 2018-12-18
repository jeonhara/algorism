package baekjoon;

import java.io.*;

public class bj_181218_11365 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String str = br.readLine();
            if(!str.equals("END")){
                for(int i=str.length()-1; i>=0; i--){
                    bw.write(str.charAt(i)+"");
                }
                bw.write("\n");
            }else{
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
