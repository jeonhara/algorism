package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class bj_181218_10817 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        arr.add(Integer.parseInt(st.nextToken()));
        arr.add(Integer.parseInt(st.nextToken()));
        arr.add(Integer.parseInt(st.nextToken()));

        Collections.sort(arr);
        bw.write(arr.get(1)+"");
        bw.flush();
        bw.close();
    }
}
