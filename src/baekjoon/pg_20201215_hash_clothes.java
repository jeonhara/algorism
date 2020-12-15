package baekjoon;

import java.io.IOException;
import java.util.HashMap;

public class pg_20201215_hash_clothes {
    public static void main(String[] args) throws IOException {
        String[][] array = new String[3][2];
        array[0][0] = "yellow_hat";
        array[0][1] = "headgear";
        array[1][0] = "blue_sunglasses";
        array[1][1] = "eyewear";
        array[2][0] = "green_turban";
        array[2][1] = "headgear";

        solution(array);
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> clotheMap = new HashMap<>();
        for (String[] clothe : clothes) {
            if (clotheMap.getOrDefault(clothe[1], 0) == 0) {
                clotheMap.put(clothe[1], 1);
            } else {
                clotheMap.put(clothe[1], clotheMap.get(clothe[1]) + 1);
            }
        }

        for (String key : clotheMap.keySet()) {
            answer *= clotheMap.get(key) + 1;
        }

        return answer - 1;
    }
}
