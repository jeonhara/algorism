package programmers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class pg_20201216_stackQueue_bridge {
  public static void main(String[] args) throws IOException {
    int bridge_length = 100;
    int weight = 100;
    int[] prices = {10,10,10,10,10,10,10,10,10,10};
    System.out.println(solution(bridge_length, weight, prices));
  }

  public static int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;

    Queue<Integer> stanbyQue = new LinkedList<>();
    for (int truck_weight : truck_weights) {
        stanbyQue.add(truck_weight);
    }

    Queue<Integer> crossQue = new LinkedList<>();
    Queue<Integer> crossLengthQue = new LinkedList<>();
    int truckWeight = 0;
    int sumWeight = 0;
    while (true) {
      answer ++;

      if (!crossQue.isEmpty()) {
        int crossLength = crossLengthQue.peek() + 1;
        if (crossLength > bridge_length) {
            sumWeight -= crossQue.peek();
        }
      }

      if (!stanbyQue.isEmpty()) {
        truckWeight = stanbyQue.peek();
        sumWeight += truckWeight;
        if (sumWeight <= weight) {
            stanbyQue.remove();
            crossQue.add(truckWeight);
            crossLengthQue.add(0);

        } else {
            sumWeight -= truckWeight;
        }
      }

      if (!crossQue.isEmpty()) {
        int size = crossLengthQue.size();
        for (int i = 0; i < size; i ++) {
          int crossLength = crossLengthQue.peek() + 1;
          if (crossLength > bridge_length) {
              crossQue.remove();
              crossLengthQue.remove();
              continue;
          }

          crossLengthQue.add(crossLengthQue.poll() + 1);
        }

      } else {
        answer --;
        break;
      }
    }

    return answer;
  }
}
