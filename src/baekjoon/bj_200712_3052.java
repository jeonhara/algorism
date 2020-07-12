package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class bj_200712_3052 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> nmgList = new ArrayList<>();

    for (int i = 0; i < 10; i ++) {
      int num = Integer.parseInt(br.readLine());
      int nmg42 = num % 42;

      int flag = 0;
      for (int nmg : nmgList) {
        if (nmg == nmg42) {
          flag = 1;
          break;
        }
      }

      if (flag == 0) {
        nmgList.add(nmg42);
      }
    }

    System.out.print(nmgList.size());
  }
}
