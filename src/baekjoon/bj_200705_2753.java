package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200705_2753 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    if ( a%4 == 0 && ( a%100 != 0 || a%400 == 0 ) ) {
      System.out.print(1);
    } else {
      System.out.print(0);
    }
  }
}
