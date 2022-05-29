package ProblemSolving;

import java.util.LinkedList;
import java.util.Queue;

public class MaxOfMinAltitudes {

    static class Coordinate{
        int x;
        int y;
        int min;
        public Coordinate(int x, int y, int min){
            this.x = x;
            this.y = y;
            this.min = min;
        }
    }
    public static int maxAltitude(int[][] arr){
        if (arr == null || arr.length == 0) return 0;
        int count=0;
        int ROWS = arr.length;
        int COLS = arr[1].length;

        Queue<MaxOfMinAltitudes.Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0,0,Integer.MAX_VALUE));
        int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int max = Integer.MIN_VALUE;
        boolean[][] visited = new boolean[ROWS][COLS];
        while (!queue.isEmpty()){
              Coordinate coordinate = queue.poll();
             visited[coordinate.x][coordinate.y] = true;

             //if()

        }

        return max;
    }

    public static void main(String[] args) {
       // int[][] arr = new int[][]{{5,1},{4,5}};
        int[][] arr = new int[][]{{1, 2, 3},
                {4, 5, 1}};;
        System.out.println(maxAltitude(arr));
    }
}
