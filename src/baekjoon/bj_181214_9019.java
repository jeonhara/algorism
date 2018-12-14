package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj_181214_9019 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=num; i++){
            arr[i] = st.nextToken();
        }

        num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int flag = 1;
            for(int j=s; j<=(e/2+1); j++){
                System.out.println("s : "+s);
                System.out.println("e : "+e);
                if(!arr[j].equals(arr[--e])){
                    flag = 0;
                    break;
                }
            }

            if(flag == 1){
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
