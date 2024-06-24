import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long binary = 0;
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        while (n!=0) {
            ans = (ans*10) + (n%2);
            n = n / 2;
        }
        while(ans!=0){
            binary = (binary*10) + (ans%10);
            ans = ans / 10;
        }
        System.out.println("Answer: "+binary);
    }   
}
