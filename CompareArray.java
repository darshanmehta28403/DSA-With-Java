import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CompareArray {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 2, 3, 1, 0, 5 };
        Arrays.sort(array1);
        Arrays.sort(array2);
        int count = 0;
        while (count < 5) {
            for (int i = count; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    if (array1[j] != array1[i]) {
                        System.out.println(array2[j]);
                    }
                }
                count += 1;
            }
        }
    }
}
