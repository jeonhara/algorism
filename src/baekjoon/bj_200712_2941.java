package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_200712_2941 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String st = br.readLine();

    int rs = 0;
    for (int i = 0; i < st.length(); i ++) {
      char ch = st.charAt(i);
      if (i+1 < st.length()) {
        if (ch == 'c') {
          if (st.charAt(i+1) == '=' || st.charAt(i+1) == '-') {
            rs++;
            i++;
            continue;
          }

        } else if (ch == 'd') {
          if (st.charAt(i+1) == '-') {
            rs++;
            i++;
            continue;
          } else if (i+2 < st.length() && st.charAt(i+1) == 'z' && st.charAt(i+2) == '=') {
            rs++;
            i += 2;
            continue;
          }

        } else if (ch == 'l' || ch == 'n') {
          if (st.charAt(i+1) == 'j') {
            rs++;
            i++;
            continue;
          }

        } else if (ch == 's' || ch == 'z') {
          if (st.charAt(i+1) == '=') {
            rs++;
            i++;
            continue;
          }
        }
      }
      rs++;
    }
    System.out.print(rs);
  }
}
