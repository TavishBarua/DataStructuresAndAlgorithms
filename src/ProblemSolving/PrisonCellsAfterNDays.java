package ProblemSolving;

import java.util.Arrays;
import java.util.HashSet;

public class PrisonCellsAfterNDays {

    public int[] prisonAfterNDays(int[] cells, int n) {

        HashSet<String> pattern = new HashSet<>();
        boolean isCycleDetected = false;
        int cycle=0;

        for(int i=0;i<n;i++){
            int[] next = nextDay(cells);
            String str = Arrays.toString(next);
            if(!pattern.contains(str)){
                pattern.add(str);
                cycle++;
            }else{
                isCycleDetected= true;
                break;
            }
            cells = next; //most imp change
        }
        if(isCycleDetected){
            n = n%cycle;
            for (int i = 0; i < n;  i++) {
                cells = nextDay(cells);
            }
        }
        return cells;
    }

    public int[] nextDay(int[] cells){
        int[] temp = new int[cells.length];
        for (int i = 1; i < cells.length-1; i++) {
            if(cells[i-1]==cells[i+1])
                temp[i]=1;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,1,1,0,0,1};
        int[] a = new PrisonCellsAfterNDays().prisonAfterNDays(arr, 15);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
    }
}
