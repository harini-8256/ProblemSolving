//quick sort is an divide and conquer algorithm based sorting algorithm.It finds the pivot element the pivot element may be the first/
// last /middle or any other element.After thet it partitions the array into two parts all the elemnts smaller then pivot
// goes to left and all the elements larger than pivot goes to the right side and then it recursively sort the left and the 
// right subarrays
// the best and average time complexity is O(nlogn)
//the worst time complexity is O(n^2) ie if we always choose smallest or the largest element
//It is in-place algorithm it does not require any additional space
//It is not stable algorithm it does not maintain the order of relative equal elements
package sorting;
public class QuickSort{
    public static void quickSorting(int arr[],int low,int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            quickSorting(arr,low,pivotIndex-1);
            quickSorting(arr, pivotIndex+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
           int pivot = arr[high];
           int i = low-1;
           for(int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
           }
           int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
           return i+1;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 7,9,0,2,1};
        System.out.println("Array before sorting");
        printArray(arr);
        quickSorting(arr, 0,arr.length-1);
        System.out.println("Array before sorting");
        printArray(arr);
    }
}