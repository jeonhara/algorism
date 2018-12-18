package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj_181218_1546 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        double[] arr = new double[num];
        double max = 0;
        double sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]) max = arr[i];
        }

        for(int i=0; i<num; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }

        bw.write(sum/num+"");
        bw.flush();
        bw.close();
    }
}
