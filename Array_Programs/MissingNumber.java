
// Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array
// Example 1:
// Input Format: N = 5, array[] = {1,2,4,5}
// Result: 3
// Explanation: In the given array, number 3 is missing. So, 3 is the answer.

// Example 2:
// Input Format: N = 3, array[] = {1,3}
// Result: 2
import java.util.*;
public class MissingNumber
 {
  private static int missingNumber(int arr[],int n){
    int totalSum = (n*(n+1))/2;
    int sum = 0;
    for(int i=0;i<arr.length;i++){
       sum += arr[i];
    }
    return totalSum - sum;
  }
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number of elemets");
    int n = scanner.nextInt();
    System.out.println("enter the elements");
    int[] arr = new int[n];
    for(int i=0;i<arr.length-1;i++){
        arr[i] = scanner.nextInt();
    }
    scanner.close();
    int res = missingNumber(arr,n);
    System.out.println(res);
   }

    
}
