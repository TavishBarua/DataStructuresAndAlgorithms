package ProblemSolving;

import java.util.HashMap;

public class MissingAndRepeatingNumber {
    public static int missingNumber= Integer.MAX_VALUE;
    public static int repeatingNumber = Integer.MAX_VALUE;
    public static int[] findMissingAndRepeating(int[] arr){
        int total = 0;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],arr[i]);
                total+=arr[i];
                continue;
            }
            repeatingNumber = arr[i];
        }
        missingNumber = Math.abs(total-(arr.length*(arr.length+1)/2));
        return new int[]{repeatingNumber,missingNumber};
    }

    public static void main(String[] args) {
            int[] arr = new int[]{3,1,3};
            int[] arr1 = new int[]{4,3,6,2,1,1};
        int[] a = findMissingAndRepeating(arr1);
        System.out.println(String.format("Missing Number: %d, RepeatingNumber: %d",missingNumber,repeatingNumber));
    }
}
