
// Problem Statement: Given an array of N integers, left rotate the array by one place.
// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 2,3,4,5,1
// Explanation: 
// Since all the elements in array will be shifted 
// toward left by one so ‘2’ will now become the 
// first index and and ‘1’ which was present at 
// first index will be shifted at last.
import java.util.*;
public class LeftRotation{
    public static void leftRotate(int arr[]){
        int temp = arr[0];
        for(int i = 0;i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        for(int i = 0;i < arr.length ;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scanner.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        leftRotate(arr);
    }
}