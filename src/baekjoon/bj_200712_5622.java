package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200712_5622 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String st = br.readLine();

    int rs = 0;
    for (int i = 0; i < st.length(); i ++) {
      int chNum = st.charAt(i) - 65;
      if (chNum < 18) {
        rs += chNum / 3 + 3;
      } else if (chNum == 18) {
        rs += 8;
      } else if (chNum >= 19 && chNum <= 21) {
        rs += 9;
      } else {
        rs += 10;
      }
    }
    System.out.print(rs);
  }
}
