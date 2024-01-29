import java.util.*;

public class oops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size + 1];

        System.out.println("enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        // insert element given position
        System.out.println("index:");
        int loc = sc.nextInt();
        System.out.println("New element:");
        int ele = sc.nextInt();
        for (int i = size; i > loc; i--) {
            arr[i] = arr[i - 1];
        }
        arr[loc] = ele;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}