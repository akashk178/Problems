
import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int sum=0;
        int temp = number;

        while (temp != 0) {
            int digit = temp%10;
            sum += digit;
            temp = temp/10;
        }

        System.out.println("Sum of digits " +number+ " is: " +sum );

        }
    }

