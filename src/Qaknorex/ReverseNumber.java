package Qaknorex;

public class ReverseNumber {
    public static long[] revNumber(long num, long num1) {
        long ans = 0;
        long ans1 = 0;
        while (num != 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }
        while (num1 != 0) {
            ans1 = ans1 * 10 + num1 % 10;
            num1 = num1 / 10;
        }
        long[] result = {ans, ans1};
        return result;
    }

    public static void main(String[] args) {
        long num = -2147483647L;
        long num1 = 2147483647L;
        long[] reversedNums = revNumber(num, num1);
        System.out.println("Before Reverse: " + num + "\nAfter Reverse: " + reversedNums[0]);
        System.out.println("Before Reverse: " + num1 + "\nAfter Reverse: " + reversedNums[1]);
}}