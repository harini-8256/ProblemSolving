//Bubble sort is an sorting algorithm that compares the adjacent element and swaps them when they are in wrong order
// untill the array is fully sorted , largest element bubbles up to the end of list in each pass
//the bext time complexity is O(n) for nearly sorted array
//wortst and average time complexity is O(n^2)
// Space complexity is O(1)
// It is in-place algo ie  In Place algorithm modifies the array without using the extra space
//It is stable sorting algo(Stable sorting algo is a algo that maintains the relative order of input elements)

package sorting;
public class BubbleSort {
    public static void bubbleSorting(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swaped = false;
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
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,5,2,9,5};
        System.out.println("Array before sorting");
        printArray(arr);
        bubbleSorting(arr);
        System.out.println("Arrray after sorting");
        printArray(arr);

    }
}
