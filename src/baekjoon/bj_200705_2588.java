package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200705_2588 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());

    int sum = 0;
    int multi = 0;
    int mock = b / 10;
    int nam = b % 10;
    int flag = 1;
    while (true) {
      multi = a * nam;
      System.out.println(multi);

      sum += multi * flag;
      flag *= 10;

      nam = mock % 10;
      mock /= 10;
      if (nam == 0) {
        break;
      }
    }
    System.out.print(sum);
  }
}
