import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите точность: ");
        double e = sc.nextDouble();

        double x = 0.5;
        double x1;
        double d;

        do {
            x1 = x - (2 * x - 1 / Math.tan(x)) /
                    (2 + 1 / (Math.sin(x) * Math.sin(x)));

            d = Math.abs(x1 - x);
            x = x1;

        } while (d > e);

        System.out.println("Корень: " + x);
    }
}