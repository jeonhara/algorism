package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200712_2562 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numList = new int[9];

    int max = 0;
    int index = 0;
    for (int i = 0; i < 9; i ++) {
      numList[i] = Integer.parseInt(br.readLine());
      if (max < numList[i]) {
        max = numList[i];
        index = i;
      }
    }

    System.out.println(max);
    System.out.print(index + 1);
  }
}
