package lab04;

import java.util.Scanner;
import com.abbluiz.Complex;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first complex number: ");
        Complex first = new Complex(input.nextDouble(), input.nextDouble());

        System.out.print("Enter the second complex number: ");
        Complex second = new Complex(input.nextDouble(), input.nextDouble());

        System.out.println("(" + first + ") + (" + second + ") = " + Complex.addS(first, second));
        System.out.println("(" + first + ") - (" + second + ") = " + Complex.subtractS(first, second));
        System.out.println("(" + first + ") * (" + second + ") = " + Complex.multiplyS(first, second));
        System.out.println("(" + first + ") / (" + second + ") = " + Complex.divideS(first, second));
        System.out.println("|" + first + "| = " + String.format("%.2f", first.abs()));

    }

}
