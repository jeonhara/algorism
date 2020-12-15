package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200705_2523 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    int i = 1;
    boolean flag = true;
    while (true) {
      for ( int j = 1; j <= i; j++ ) {
        System.out.print("*");
      }

      if (flag) {
        if ( i < a ) {
          i++;
        } else {
          flag = false;
          i--;
        }
      } else {
        i--;
        if ( i < 1 ) {
          break;
        }
      }

      System.out.println();
    }
  }
}
