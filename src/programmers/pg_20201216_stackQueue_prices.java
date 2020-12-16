package programmers;

import java.io.IOException;
import java.util.*;

public class pg_20201216_stackQueue_prices {
    public static void main(String[] args) throws IOException {
        int[] prices = {1, 2, 3, 2, 3};
        solution(prices);
    }

    public static int[] solution(int[] prices) {

        Queue<Integer> priceQue = new LinkedList<>();
        for (int price : prices) {
            priceQue.add(price);
        }

        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i ++) {

            int priceValue = priceQue.poll();  //반환 후 제거

            if (!priceQue.isEmpty()) {
                int j = 0;
                for (int priceQueValue : priceQue) {
                    answer[i] = ++ j;
                    if (priceValue > priceQueValue) {
                        break;
                    }
                }

            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }
}
