package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_181022_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int i=0, start=0, end=0, up=0, down=0;

        while(true){
            i++;
            end += i;
            if(end >= num) break;
        }
        start = end-i+1;
        up = 1;
        down = i;
        for(int n=start; n<num; n++){
            up++;
            down--;
        }
        if(i%2 == 0) System.out.println(up+"/"+down);
        else System.out.println(down+"/"+up);
    }
}