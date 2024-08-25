public class SumDigits {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;    
        }
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
