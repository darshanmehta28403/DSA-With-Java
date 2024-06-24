import java.util.Scanner;

public class SwapArrayElement {
    public void swap(int a[], int n) {
        int temp = 0;
        for (int i = n - 2; i < n; i++) {
            for (int j = n - 1; j < n; j++) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String... args) {
        int[] a = new int[6];
        int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the choice: ");
        System.err.print("1) Print Array Element \n2) Swap Array Element: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                for (int i = 0; i < n; i++) {
                    System.out.println(a[i]);
                }
                break;
            case 2:
                SwapArrayElement obj1 = new SwapArrayElement();
                obj1.swap(a, n);
                break;
        }
    }
}
