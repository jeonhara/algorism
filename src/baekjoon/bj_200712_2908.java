package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_200712_2908 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    String aStr = "";
    String bStr = "";
    for (int i = 2; i >= 0; i--) {
      aStr += String.valueOf(a).charAt(i);
      bStr += String.valueOf(b).charAt(i);
    }

    a = Integer.parseInt(aStr);
    b = Integer.parseInt(bStr);
    System.out.println(a > b ? a : b);
  }
}
