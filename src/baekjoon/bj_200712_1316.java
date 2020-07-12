package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class bj_200712_1316 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    int rs = 0;
    for (int i = 0; i < num; i ++) {
      String str = br.readLine();
      rs++;

      List<String> list = new ArrayList<>();
      for (int j = 0; j < str.length(); j ++) {
        String inStr = str.charAt(j) + "";

        int flag = 1;
        for (int k = 0; k < list.size(); k ++) {
          if (inStr.equals(list.get(k))) {
            if (k == list.size() -1) {
              flag = 2;
            } else {
              rs--;
              flag = 0;
              break;
            }
          }
        }

        if (flag == 0) {
          break;

        } else if (flag == 1) {
          list.add(inStr);
        }
      }
    }
    System.out.print(rs);
  }
}
