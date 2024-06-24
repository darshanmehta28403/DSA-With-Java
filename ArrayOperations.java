import java.util.*;

class ArrayOperations {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 33;
        arr[1] = 83;
        arr[2] = 55;
        arr[3] = 7;
        arr[4] = 18;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter Operation No.: \n 1) Array Insert \n 2) Array Delete \n " + //
                        "3) Array Update  \n 4) Array Sort \n 5) Array Reverse ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter no of Element you want to Insert");
                int el = sc.nextInt();
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    count++;
                }
                arr[count - 1] = el;
                System.out.println("Elemetns are: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                break;
            case 2:
                System.out.println("Enter no of Element you want to Delete");
                int el1 = sc.nextInt();
                System.out.println("Elemetns are: ");
                for (int i = 0; i < arr.length; i++) {
                    if (i == el1 - 1) {
                        continue;
                    } else {
                        System.out.println(arr[i]);
                    }
                }
                System.out.println("Element Deleted: " + arr[el1 - 1]);
                break;
            case 3:
                System.out.println("Enter no of Element you want to Update");
                int el2 = sc.nextInt();
                System.out.println("Enter New Element");
                int newel = sc.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    if (i == el2 - 1) {
                        arr[i] = newel;
                    }
                }
                System.out.println("Elemetns are: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                break;
            case 4:
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        if (j != arr.length - 1) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                System.out.println("Elements are: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                break;
            case 5:
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        if (j != arr.length - 1) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        } else {
                            continue;
                        }
                    }
                }
                System.out.println("Elements are: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
        }
    }
}