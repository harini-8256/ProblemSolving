package sorting;
import java.util.*;
public class InsertionSort {
    public void insertionSort(int arr[],int n){
        for(int i =1;i<n;i++){
            int key =arr[i];
            int j = i-1;
            while (j>=0 && arr[j] >key){
                arr[j+1] = arr[j];
                j--;
            }
        arr[j+1] = key;
        }

    }
    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        InsertionSort ob =new InsertionSort();
        System.out.println("array before sorting");
        ob.printArray(arr);
        ob.insertionSort(arr, n);
        System.out.println("Array after sorting");
        ob.printArray(arr);
    }
}
