import java.util.ArrayList;

public class MyProg {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int i = 1;
        int ans = 0;
        int count = 0;
        ArrayList<Integer> number = new ArrayList<>();
        for (i = 1; i <=n; i++) {
            count += 1;
            ans += arr[i];
            if (count != n) {
                if (ans == s) {
                    if (count == 1) {
                        number.add(arr[i]);
                        System.out.println("execute 1");
                        return number;
                    } else {
                        for (int j = i - count + 1; j <= i; j++) {
                            number.add(arr[j]);
                        }
                        System.out.println("execute 2");
                        return number;
                    }
                } else {
                    i += 1;
                }
            } else {
                System.out.println("execute 3");
                number.add(-1);
                return number;
            }
        }
        return number; // Return the ArrayList if no subarray is found
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        System.out.println(subarraySum(arr, 5, 12));
    }
}