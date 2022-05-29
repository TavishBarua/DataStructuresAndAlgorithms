package Sortings;
import java.io.*;
import java.util.*;

public class BubbleSort {
        public static void bubbleSort(int[] arr) {
            //write your code here
            for (int i = 1; i <= arr.length-1; i++) {
                for (int j = 0; j < arr.length-i; j++) {
                    if(isSmaller(arr,j+1,j)){
                        swap(arr, j+1,j);
                    }
                }
            }

        }

        public static void swap(int arr[], int a, int b){
            int temp = arr[a];
            arr[a]=arr[b];
            arr[b]= temp;
        }

        public static boolean isSmaller(int arr[], int a, int b){
            if(arr[a]<arr[b]){
                return true;
            }else{
                return false;
            }
        }

        public static void print(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            bubbleSort(arr);
            print(arr);
        }

}
