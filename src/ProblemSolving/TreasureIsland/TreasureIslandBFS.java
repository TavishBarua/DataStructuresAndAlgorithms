package ProblemSolving.TreasureIsland;

import java.util.LinkedList;
import java.util.Queue;

public class TreasureIslandBFS {


    public static int treasureIsland(char[][] island){
        if (island == null || island.length == 0) return 0;
        int count=0;

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0,0));
        boolean[][] visited = new boolean[island[0].length][island[1].length];
        visited[0][0] = true;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty()){

            int size = queue.size();
            for(int i = 0;i<size;i++){
                Coordinate coordinate = queue.poll();
                int x = coordinate.x;
                int y = coordinate.y;

                if(island[x][y]=='X') return count;
                for (int[] dir:
                        dirs) {
                    int newX = x+dir[0];
                    int newY = y+dir[1];
                    if(newX>=0 && newX<island[0].length && newY>=0 && newY<island[1].length && island[x][y]!='D' && !visited[newX][newY]){
                        queue.add(new Coordinate(newX,newY));
                        visited[newX][newY] = true;
                    }
                }
            }
            count++;
        }


        return 0;
    }

    public static void main(String[] args) {
        char[][] island = new char[][]{
                {'O', 'O', 'O', 'O'},
                {'D', 'O', 'D', 'O'},
                {'O', 'O', 'O', 'O'},
                {'X', 'D', 'D', 'O'}
        };
        int result = TreasureIslandBFS.treasureIsland(island);
        System.out.println(String.format("%s (expect 5)", result));
    }

    static class Coordinate{
        int x;
        int y;
        public Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
}
