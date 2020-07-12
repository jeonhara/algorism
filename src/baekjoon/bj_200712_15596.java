package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class bj_200712_15596 {
  public static void main(String[] args) throws IOException {

  }

  public class Test {
    long sum(int[] a) {
      long ans = 0;
      for (int i = 0; i < a.length; i++) {
        ans += a[i];
      }
      return ans;
    }
  }
}
