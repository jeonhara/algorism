package programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class pg_20201218_stackQueue_print {
  public static void main(String[] args) throws IOException {
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;
    System.out.println(solution(priorities, location));
  }

  static class Print {
        int idx;
        int importance;

        public Print(int idx, int importance) {
            this.idx = idx;
            this.importance = importance;
        }
    }

  public static int solution(int[] priorities, int location) {

        Queue<Print> stanbyQue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i ++) {
            stanbyQue.add(new Print(i, priorities[i]));
        }

        Arrays.sort(priorities);

        int answer = 0;
        while (!stanbyQue.isEmpty()) {
            Print firstPrint = stanbyQue.poll();

            if (firstPrint.importance < priorities[priorities.length - 1 - answer]) {
                stanbyQue.add(firstPrint);
            } else {
                answer ++;
                if (firstPrint.idx == location) {
                    break;
                }
            }
        }

        return answer;
    }
}
