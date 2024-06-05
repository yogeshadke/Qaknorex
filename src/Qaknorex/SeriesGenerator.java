package Qaknorex;

public class SeriesGenerator {
    public static void printTheSequence(int a, int b, int n) {
        int currentValue = a;
        int increment = b;
        for (int i = 0; i < n; i++) {
            currentValue += (int) Math.pow(2, i) * increment;
            System.out.print(currentValue + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Series for a=0, b=2, n=10:");
        printTheSequence(0, 2, 10);
        System.out.println("\nSeries for a=5, b=3, n=5:");
        printTheSequence(5, 3, 5);
    }
}
