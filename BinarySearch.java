import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n = arr.length;
        int i = 0;
        boolean found = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements: ");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }

        System.out.println("Enter element to search: ");
        int el = sc.nextInt();

        while (i < n) {
            int mid = (i + n) / 2;
            if (el == arr[mid]) {
                System.out.println("Element found: " + arr[mid]);
                found = true;
                break;
            } else if (el < arr[mid]) {
                n = mid;
            } else{
                i = mid + 1;
            }
        }
        if (found == false) {
            System.out.println("Element Not found");
        }
    }
}
