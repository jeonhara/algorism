package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200712_1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String st = br.readLine();
    String str = st.toUpperCase();
    int[] charCnt = new int[26];

    int max = 0;
    char rsChar = '?';
    for (int i = 0; i < st.length(); i ++) {
      char ch = str.charAt(i);
      int chNum = ch - 65;
      charCnt[chNum]++;

      if (max < charCnt[chNum]) {
        max = charCnt[chNum];
        rsChar = ch;

      } else if (max == charCnt[chNum]) {
        rsChar = '?';
      }
    }
    System.out.print(rsChar);
  }
}
