package com.abbluiz;

public class Complex implements Cloneable, Comparable<Complex> {

    private double a;
    private double b;

    public Complex(double a, double b) {

        this.a = a;
        this.b = b;

    }

    public Complex(double a) {

        this.a = a;
        this.b = 0;

    }

    public Complex() {

        this.a = 0;
        this.b = 0;

    }

    public double getRealPart() { return this.a; }

    public double getImaginaryPart() { return this.b; }

    public void add(Complex num) {

        this.a += num.a;
        this.b += num.b;

    }

    public void subtract(Complex num) {

        this.a -= num.a;
        this.b -= num.b;

    }

    public void multiply(Complex num) {

        this.a = (this.a * num.a) - (this.b * num.b);
        this.b = (this.b * num.a) + (this.a * num.b);

    }

    public void divide(Complex num) {

        double commonDividend = (Math.pow(num.a, 2) + Math.pow(num.b, 2));

        this.a = ((this.a * num.a) + (this.b * num.b)) / commonDividend;
        this.b = ((this.b * num.a) - (this.a * num.b)) / commonDividend;

    }

    public double abs() {

        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));

    }

    public static Complex addS(Complex num1, Complex num2) {

        return (new Complex(num1.a + num2.a, num1.b + num2.b));

    }

    public static Complex subtractS(Complex num1, Complex num2) {

        return (new Complex(num1.a - num2.a, num1.b - num2.b));

    }

    public static Complex multiplyS(Complex num1, Complex num2) {

        double a = (num1.a * num2.a) - (num1.b * num2.b);
        double b = (num1.b * num2.a) + (num1.a * num2.b);

        return (new Complex(a, b));

    }

    public static Complex divideS(Complex num1, Complex num2) {

        double commonDividend = (Math.pow(num2.a, 2) + Math.pow(num2.b, 2));

        double a = ((num1.a * num2.a) + (num1.b * num2.b)) / commonDividend;
        double b = ((num1.b * num2.a) - (num1.a * num2.b)) / commonDividend;

        return (new Complex(a, b));

    }

    @Override
    public String toString() {

        if (this.b != 0) {

            return String.format("%.2f + %.2fi", this.a, this.b);

        } else {

            return String.format("%.2f", this.a);

        }

    }

    @Override
    public int compareTo(Complex o) {

        if (this.a < o.a)
            return -1;
        else if (this.a > o.a)
            return 1;

        return Double.compare(this.b, o.b);

    }

    @Override
    public Object clone() {

        return (new Complex(this.a, this.b));

    }

}
