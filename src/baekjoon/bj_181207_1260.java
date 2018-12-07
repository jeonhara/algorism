package baekjoon;

    // BFS, DFS
    // 참고 : http://mygumi.tistory.com/102

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class bj_181207_1260 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrNum = Integer.parseInt(st.nextToken());
        int lineNum = Integer.parseInt(st.nextToken());
        int sPoint = Integer.parseInt(st.nextToken());

        int[][] arr = new int[arrNum+1][arrNum+1];
        for(int i=1; i<=lineNum; i++){
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            arr[row][col] = arr[col][row] = 1;
        }

        boolean[] flag = new boolean[arrNum+1];
        DFS(arr, flag, sPoint);
        System.out.println();
        for(int i=0; i<flag.length; i++){
            flag[i] = false;
        }
        BFS(arr, flag, sPoint);
    }

    public static void DFS(int[][] arr, boolean[] flag, int point){     //arr모든배열, flag방문여부, point정점
        boolean boo;

        Stack<Integer> st = new Stack<>();
        st.push(point);
        flag[point] = true;
        System.out.print(point+" ");

        while(!st.empty()){
            int num = st.peek();
            boo = false;

            for(int i=1; i<arr.length; i++){
                if(arr[num][i] == 1 && !flag[i]){
                    st.push(i);
                    flag[i] = true;
                    boo = true;
                    System.out.print(i+" ");
                    break;
                }
            }
            if(!boo){
                st.pop();
            }
        }
    }

    public static void BFS(int[][] arr, boolean[] flag, int point){
        Queue<Integer> qu = new LinkedList<>();
        qu.add(point);
        flag[point] = true;

        while(!qu.isEmpty()){
            point = qu.poll();
            System.out.print(point+" ");

            for(int i=1; i<arr.length; i++){
                if(arr[point][i] == 1 && !flag[i]){
                    qu.add(i);
                    flag[i] = true;
                }
            }
        }
    }
}
