package programmers;

import java.io.IOException;
import java.util.*;

public class pg_20201222_array_citations {
  public static void main(String[] args) throws IOException {
    int[] citations = {10, 9, 4, 1, 1};
    System.out.println(solution(citations));
  }

  public static int solution(int[] citations) {

        Arrays.sort(citations);

        for (int i = citations.length; i > 0; i --) {
            if (i <= citations[citations.length - i]) {
                return i;
            }
        }

        return 0;
    }
}
