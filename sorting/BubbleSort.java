package sorting;
import java.util.*;
public class BubbleSort {
    public static void bubbleSorting(int arr[],int n){
        boolean swaped;
        for(int i=0;i<n-1;i++){
            swaped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
             }
             if(!swaped){
                break;
             }
        }
    }
     public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array before sorting");
        printArray(arr);
        bubbleSorting(arr, n);
        System.out.println("array after sorting");
        printArray(arr);

    }
}
