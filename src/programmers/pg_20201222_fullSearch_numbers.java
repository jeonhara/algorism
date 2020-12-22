package programmers;

import java.util.TreeSet;

public class pg_20201222_fullSearch_numbers {

  public static TreeSet<String> treeSet = new TreeSet<>();
  public static int answer;

  public static void main(String[] args) {
    System.out.println(solution("99999"));
  }

  public static int solution(String numbers) {

    Character[] cArray = new Character[numbers.length()];
    for (int i = 0; i < numbers.length(); i ++) {
      cArray[i] = numbers.charAt(i);
    }

    for (int i = 0; i < cArray.length; i ++) {
      permutation(cArray, 0, cArray.length, i + 1);
    }

    return answer;
  }

  //순열
  public static void permutation(Character[] arr, int dept, int n, int r) {
    if (dept == r) {
			if (arr[0] != '0') {
				String str = "";
        for (int i = 0; i < r; i++) {
          str += arr[i];
        }

				if (!treeSet.contains(str)) {
					int num = Integer.parseInt(str);
					treeSet.add(str);

					if (isPrime(num)) {
						answer++;
					}
				}
			}
			return;
		}

		for (int i = dept; i < n; i++) {
			swap(arr, dept, i);
			permutation(arr, dept + 1, n, r);
			swap(arr, dept, i);
		}
  }

  public static void swap(Character[] arr, int depth, int i) {
    Character temp = arr[depth];
    arr[depth] = arr[i];
    arr[i] = temp;
  }

  //소수 판단
  public static boolean isPrime(int num) {
    if (num == 2) {
      return true;
    }

    if (num == 1 ||num % 2 == 0) {
      return false;
    }

    for (int i = 3; i <= Math.sqrt(num); i ++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
