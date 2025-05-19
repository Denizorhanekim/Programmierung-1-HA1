
import java.util.Scanner;

public class Programmieraufgabe7 {

    public static int getMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie bitte die erste Zahl ein (a): ");
        int a = scanner.nextInt();

        System.out.print("Geben Sie bitte die zweite Zahl ein (b): ");
        int b = scanner.nextInt();

        System.out.print("Geben Sie bitte die dritte Zahl ein (c): ");
        int c = scanner.nextInt();

        int maximum = getMax(a, b, c);
        System.out.println("Das Maximum Wert ist: " + maximum);

        scanner.close();
    }
}
