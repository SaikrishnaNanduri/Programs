package easy;

import java.util.Scanner;

public class FrequencyOfDigit {

    public static int findFrequency(int n, long d) { // n is digit to find, d is number
        int f = 0;

        while(d > 0) {
            int c_digit = (int)(d % 10);
            if(c_digit == n) {
                f++;
            }
            d /= 10;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        long d = sc.nextLong();
        System.out.print("Enter Digit to find: ");
        int n = sc.nextInt();
        int result = findFrequency(n, d);
        System.out.println(result);
    }
}
