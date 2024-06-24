import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String... args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int originalno = n;
        while (n != 0) {
            ans = (ans * 10) + (n % 10);
            n /= 10;
        }
        System.out.println("Answer: " + ans);
        if (ans != originalno) {
            System.out.println("The Number is not palindrome");
        } else {
            System.out.println("The Number is palindrome");
        }
    }
}
