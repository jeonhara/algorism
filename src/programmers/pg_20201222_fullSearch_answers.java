package programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class pg_20201222_fullSearch_answers {
  public static void main(String[] args) throws IOException {
    int[] answers = {1,3,2,4,2};
    System.out.println(solution(answers));
  }

  public static int[] solution(int[] answers) {
        int[][] people = new int[3][];
        people[0] = new int[]{1, 2, 3, 4, 5};
        people[1] = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        people[2] = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answerRightNum = new int[3];
        for (int i = 0; i < people.length; i ++) {
            int pLength = 0;
            for (int answerInt : answers) {
                if (pLength >= people[i].length) {
                  pLength = 0;
                }

                if (answerInt == people[i][pLength]) {
                    answerRightNum[i] ++;
                }
                pLength ++;
            }
        }

        int max = Math.max(Math.max(answerRightNum[0], answerRightNum[1]), answerRightNum[2]);
        ArrayList<Integer> maxArray = new ArrayList<>();
        for (int i = 0; i < answerRightNum.length; i ++) {
          if (max == answerRightNum[i]) {
            maxArray.add(i);
          }
        }

        int[] answer = new int[maxArray.size()];
        for (int i = 0; i < maxArray.size(); i ++) {
          answer[i] = maxArray.get(i) + 1;
        }

        return answer;
    }
}
