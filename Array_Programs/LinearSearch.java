// Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.

// Examples:

// Example 1:
// Input: arr[]= 1 2 3 4 5, num = 3
// Output: 2
// Explanation: 3 is present in the 2nd index

// Example 2:
// Input: arr[]= 5 4 3 2 1, num = 5
// Output: 0
// Explanation: 5 is present in the 0th index
import java.util.*;
public class LinearSearch {
    private static int findTargetElement(int arr[],int k){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
          Scanner scanner = new Scanner(System.in);
          System.out.println("enter the target element");
          int k = scanner.nextInt();
          System.out.println("enter the number of elements ");
          int n = scanner.nextInt();
          int arr[] = new int[n];
          for(int i = 0;i<n;i++){
              arr[i] = scanner.nextInt();
          }
          scanner.close();
          int res= findTargetElement(arr, k);
          if(res == -1){
            System.out.println("element not found");
          }
          else{
            System.out.println("element found at index"+ res);
         }
    }
}
