//selection sort is a sorting algorithm ,It is a comparsion based algorithm It works by dividing the array into
//parts sorted and unsorted part,It selects the minimum element from the unsorted part and moves to the beginning 
// of the sorted part
//time complexity is O(n^2) - same for average ,best and worst case
//it will have atmost n swaps
// it has n^2 comparsions
//it is in-place algorithm -(In-place algorithm is a algorithm it modifies the array without using the extra space)
//it is not stable algorithm (it does not maintain the relative order of equal elements)
package sorting;
public class SelectionSort {

    public static void selectionSorting(int arr[]){
            int n = arr.length;
            int minIndex;
            for(int i=0;i<n-1;i++){
                 minIndex = i;
                for(int j =i+1;j<n;j++){
                    if(arr[j] < arr[minIndex]){
                        minIndex = j;
                    }
                }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            }
            
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Array Before Sorting");
        int arr[] = {1,8,2,6,7};
        printArray(arr);
        selectionSorting(arr);
        System.out.println("Array after sorting");
        printArray(arr);

    }
}
