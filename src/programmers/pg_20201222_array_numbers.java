package programmers;

import java.io.IOException;
import java.util.*;

public class pg_20201222_array_numbers {
  public static void main(String[] args) throws IOException {
    int[] numbers = {6, 10, 2};
    System.out.println(solution(numbers));
  }

  public static String solution(int[] numbers) {
        List<String> answerList = new ArrayList<>();
        for (int number : numbers) {
            answerList.add(String.valueOf(number));
        }

        Collections.sort(answerList, new Comparator<String>(){
           @Override
           public int compare(String a, String b) {
               return (b + a).compareTo(a + b);
           }
        });

        if ("0".equals(answerList.get(0))) {
            return "0";
        }

        String answer = "";
        for (String answerString: answerList) {
            answer += answerString;
        }

        return answer;
    }
}
