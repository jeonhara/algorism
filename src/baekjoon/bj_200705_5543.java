package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_200705_5543 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int d = Integer.parseInt(br.readLine());
    int e = Integer.parseInt(br.readLine());

    int min1 = a < b ? (a < c ? a : c) : (b < c ? b : c);
    int min2 = d < e ? d : e;
    System.out.print(min1 + min2 - 50);
  }
}
