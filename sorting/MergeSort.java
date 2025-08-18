// Merge sort is not comparison based algorithm it based on divide and conquer algorithm 
// It divides the array into two parts ie two halves and and it recursively sort the two halves and
// then combine the two sorted halves into the final array
// the best,worst and average time complexity is O(nlogn)
// the space complexity is O(n)
// It is not a In-Place algorithm becoz it requires an extra space to modify the array
// It is a stable algorithm it doesn't swap equal elements

package sorting;
public class MergeSort{
  public static void mergeSorting(int arr[],int low,int high){
    if(low < high){
      int mid = (low+high)/2;
      mergeSorting(arr, low, mid);
      mergeSorting(arr, mid+1, high);
      merge(arr,low,mid,high);
    }
  }
  public static void merge(int arr[],int low,int mid,int high){
    int n1 = mid-low+1;
    int n2 = high-mid;
    int l1[] = new int[n1];
    int l2[] = new int[n2];
    for(int i=0;i<n1;i++){
      l1[i] = arr[low+i];
    }
    for(int j=0;j<n2;j++){
      l2[j] = arr[mid+j+1];
    }
    int i=0,j=0,k=low;
    while(i<n1 && j<n2){
      if(l1[i]<=l2[j]){
        arr[k] = l1[i];
        i++;
      }
      else{
        arr[k] = l2[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      arr[k] = l1[i];
      i++;
      k++;
    }
    while(j<n2){
      arr[k] = l2[j];
      j++;
      k++;
    }
  }
  public static void printArray(int  arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] +" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = {3,8,1,9,0};
    System.out.println("Array before sorting");
    printArray(arr);
    mergeSorting(arr,0,arr.length-1);
    System.out.println("Array after sorting");
    printArray(arr);
  }
}