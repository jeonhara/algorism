package programmers;

public class pg_20201222_fullSearch_carpet {

  public static void main(String[] args) {
    solution(10, 2);
  }

  public static int[] solution(int brown, int yellow) {
    int[] answer = new int[2];
      //2x + 2y - 4 = brown >> x + y = (brown + 4) / 2
      //(x - 2) * (y - 2) = yellow >> xy = brown + yellow

      int sum = brown + yellow;
      for (int i = sum; i >= 1; i --) {
          if (sum % i != 0) {
              continue;
          }

          int x = i;
          int y = sum / i;

          if (x + y == (brown + 4) / 2) {
              answer[0] = x;
              answer[1] = y;
              break;
          }
      }

      return answer;
  }
}
