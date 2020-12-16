package programmers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class pg_20201216_stackQueue_bridge {
    public static void main(String[] args) throws IOException {
        int bridge_length = 2;
        int weight = 10;
        int[] prices = {7,4,5,6};
        solution(bridge_length, weight, prices);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        int weightSum = 0;
        int second = 0;
        Queue<Integer> truckQue = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            for (int i = 0; i < bridge_length; i ++) {
                second ++;
                weightSum += truck_weight;

                if (weight >= weightSum) {
                    truckQue.add(truck_weight);
                }
            }
        }


        int answer = 0;
        return answer;
    }
}
