import java.util.*;
public class RightRotation {
    public static void rightRotate(int arr[]){
        int temp = arr[arr.length-1];
        for(int i = arr.length-1 ;i > 0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scanner.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        rightRotate(arr);
    }
}
