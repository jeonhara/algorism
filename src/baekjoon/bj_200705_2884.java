package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

public class bj_200705_2884 {
  public static void main(String[] args) throws IOException, ParseException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String h = st.nextToken();
    String m = st.nextToken();
    SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm");

    Calendar cal = Calendar.getInstance();
    cal.setTime(transFormat.parse(h + ":" + m));
    cal.add(Calendar.MINUTE, -45);

    transFormat = new SimpleDateFormat("H m");
    System.out.print(transFormat.format(cal.getTime()));
  }
}
