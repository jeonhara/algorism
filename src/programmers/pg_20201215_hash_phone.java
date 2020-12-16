package programmers;

import java.io.*;
import java.util.Arrays;

public class pg_20201215_hash_phone {
    public static void main(String[] args) throws IOException {
        String[] array = new String[3];
        array[0] = "1195524421";
        array[1] = "119";
        array[2] = "97674223";

        solution(array);
    }

    public static boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i ++) {
            for (int j = i + 1; j < phone_book.length; j ++) {
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
