import java.util.*;

public class oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count = 0;
        System.out.println("enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < size; i++) {
            count++;
        }
        System.out.println("total number of elements:" + count);
    }
}