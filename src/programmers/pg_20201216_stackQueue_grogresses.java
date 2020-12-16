package programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class pg_20201216_stackQueue_grogresses {
    public static void main(String[] args) throws IOException {
        int[] progresses = {93, 99, 99, 99};
        int[] speeds = {1, 1, 1, 1};

        int[] rs = solution(progresses, speeds);
        for (int value : rs) {
            System.out.println(value);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> progresseQue = new LinkedList<>();
        for (int i = 0; i < speeds.length; i ++) {
            progresseQue.add((int) Math.ceil(((double)100 - progresses[i]) / speeds[i]));
        }

        List<Integer> resultList = new ArrayList<>();

        int resultNum = 1;
        int value1 = progresseQue.poll();
        while(!progresseQue.isEmpty()) {
            int value2 = progresseQue.poll();

            if (value1 >= value2) {
                resultNum ++;
            } else {
                resultList.add(resultNum);
                value1 = value2;
                resultNum = 1;
            }
        }
        resultList.add(resultNum);

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i ++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
