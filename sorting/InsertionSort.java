//Insertion sort is a sorting algorithm 
// It is a Comparison based algorithm that builts the final sorted array one element at a time 
// At ever step it takes one unsorted element and places it to its correct position among already sorted elements to its left
// the best time complexity is O(n)
//Average and worst time complexity is O(n^2)
//Space Complexity is O(1) Ii is stable sorting algorithm
// It is In-Place sorting algorithm it does not require extra space to modify the array
// It is Stable sorting algorithm it maintains the relative order of equal elements
// ie it doesn't swap the equal elements it shifts the largest elements to the right side of the array
package sorting;
public class InsertionSort {
    public static void insertionSorting(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
             arr[j+1] = key;
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,9,2,7,1};
        System.out.println("Array before sorting");
        printArray(arr);
        System.out.println("Array after sorting");
        insertionSorting(arr);
        printArray(arr);
    }
}
