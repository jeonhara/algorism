package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_200705_2884_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    if ( m < 45 ) {
      if ( h == 0 ) {
        System.out.print(23 + " " + (m + 60 - 45));
      } else {
        System.out.print((h - 1) + " " + (m + 60 - 45));
      }

    } else {
      System.out.print(h + " " + (m - 45));
    }

  }
}
