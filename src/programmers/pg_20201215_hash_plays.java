package programmers;

import java.io.IOException;
import java.util.*;

public class pg_20201215_hash_plays {
    public static void main(String[] args) throws IOException {
        String[] genres = new String[6];
        genres[0] = "classic";
        genres[1] = "pop";
        genres[2] = "classic";
        genres[3] = "classic";
        genres[4] = "pop";
        genres[5] = "hara";

        int[] plays = new int[6];
        plays[0] = 500;
        plays[1] = 600;
        plays[2] = 150;
        plays[3] = 800;
        plays[4] = 2500;
        plays[5] = 4000;

        solution(genres, plays);
    }

    public static int[] solution(String[] genres, int[] plays) {
        //장르 별 합계
        Map<String, Integer> genreSumMap = new HashMap<>();
        for (int i = 0; i < genres.length; i ++) {
            if (genreSumMap.getOrDefault(genres[i], 0) == 0) {
                genreSumMap.put(genres[i], plays[i]);
            } else {
                genreSumMap.put(genres[i], genreSumMap.get(genres[i]) + plays[i]);
            }
        }

        //장르 별 합계 내림차순
        List<Map.Entry<String, Integer>> genreSumMapList = new ArrayList<>(genreSumMap.entrySet());
        Collections.sort(genreSumMapList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //각각 장르별 top2 뽑기
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> sortMap : genreSumMapList) {

            Map<Integer, Integer> playMap = new HashMap<>();
            for (int i = 0; i < genres.length; i ++) {
                if (sortMap.getKey().equals(genres[i])) {
                    playMap.put(i, plays[i]);
                }
            }

            List<Map.Entry<Integer, Integer>> playMapList = new ArrayList<>(playMap.entrySet());
            Collections.sort(playMapList, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            int i = 0;
            for (Map.Entry<Integer, Integer> sortPlayMap : playMapList) {
                result.add(sortPlayMap.getKey());
                i++;
                if (i > 1) {
                    break;
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i ++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
