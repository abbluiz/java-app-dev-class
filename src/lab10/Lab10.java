package lab10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab10 {

    private static double m1 (int n) {

        if (n == 1)
            return 1.0;
        else
            return (1.0 / n) + m1 (n - 1);

    }

    private static double m2 (int n) {

        if (n == 1)
            return (n / (n + 1.0));
        else
            return (n / (n + 1.0)) + m2 (n - 1);

    }

    private static double m3 (int n) {

        if (n == 1)
            return (n / ((2.0 * n) + 1.0));
        else
            return (n / ((2.0 * n) + 1.0)) + m3 (n - 1);

    }

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter n: ");
        int n = input.nextInt();

        System.out.println("\ni\tm1(i)\tm2(i)\tm3(i)");
        System.out.println("***************************");

        for (int i = 1; i <= 10; i++) {

            DecimalFormat m1 = new DecimalFormat("0.00");
            DecimalFormat m2 = new DecimalFormat("0.00");
            DecimalFormat m3 = new DecimalFormat("0.00");

            System.out.println(i + "\t" + m1.format(m1(i)) + "\t" + m2.format(m2(i)) + "\t" + m3.format(m3(i)));

        }

    }

}
