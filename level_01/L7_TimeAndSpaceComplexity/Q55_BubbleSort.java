package L7_TimeAndSpaceComplexity;
import java.util.*;

// 1. You are given an array(arr) of integers.
// 2. You have to sort the given array in increasing order using bubble sort.

public class Q55_BubbleSort {
    public static void bubbleSort(int[] arr) {
        //write your code here
        for(int i=arr.length-1; i>=0; i--){
          for(int j=1; j<=i; j++){
            if(isSmaller(arr, j, j-1)) swap(arr, j, j-1);
          }
        }
      }
    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
      // return true if ith element is smaller than jth element
      public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
          return true;
        } else {
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
