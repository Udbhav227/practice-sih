import java.util.Scanner;
public class SumDigits {


        public static int sumOfDigits(int n) {

            int number, digit, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            while(number > 0)
            {

                digit = number % 10;

                sum = sum + digit;

                number = number / 10;
            }

            System.out.println("Sum of Digits: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));  // Output: 6
        System.out.println(sumOfDigits(4567)); // Output: 22
        System.out.println(sumOfDigits(0));    // Output: 0
    }
}

// Write a method sumOfDigits(int n) that takes a 
// non-negative integer n and returns the sum of its digits.
