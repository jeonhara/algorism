package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_200705_1110 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String num = br.readLine();
    int origin = Integer.parseInt(num);

    int i = 0;
    while (true) {
      num = num.length() < 2 ? "0" + num : num;

      int sum = Integer.parseInt(num.charAt(0) + "")  + Integer.parseInt(num.charAt(1) + "");
      String sumStr = String.valueOf(sum).length() < 2 ? "0" + sum : String.valueOf(sum);

      num = num.charAt(1) + "" + sumStr.charAt(1);

      i++;
      if ( origin == Integer.parseInt(num) ) {
        break;
      }
    }
    System.out.print(i);
  }
}
