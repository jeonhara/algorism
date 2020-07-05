package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200705_10996 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    for ( int i = 1; i <= a*2; i++ ) {
      for ( int j = 1; j <= a; j++ ) {
        if ( (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
