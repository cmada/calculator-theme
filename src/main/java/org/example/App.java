package org.example;

public class App
{
    public static void main(String[] args )
    {
       Calculator calculator = new Calculator();
       int x = 100;
       int y = 120;

        System.out.println(" Calculating the sum of " + x + " and " + y);
        int sum = calculator.sum(x,y);
        System.out.println(" The sum is " + sum);

        System.out.println(" Calculating the difference of " + x + " and " + y);
        int difference = calculator.minus(x,y);
        System.out.println(" The result is " + difference);

        System.out.println(" Calculating the product of " + x + " and " + y);
        int product = calculator.multiply(x,y);
        System.out.println(" The product is " + product);

        System.out.println(" Dividing " + x + " and " + y);
        int result = calculator.divide(x,y);
        System.out.println(" The result is " + result);

        double m = 127.55;
        double n = 323.99;

        System.out.println("Calculating the sum of " + m + " and " + n);
        double doubleSum = calculator.sum(m,n);
        System.out.println("The sum is " + doubleSum);

        System.out.println("Calculating the product of " + m + " and " + n);
        double doubleProduct = calculator.multiply(m,n);
        System.out.println("The product is " + doubleProduct);

        System.out.println("Dividing " + m + " by " + n);
        double doubleResult = calculator.divide(m,n);
        System.out.println("The result is " + doubleResult);

        System.out.println("Calculating the difference of " + m + " and " + n);
        double doubleDifference = calculator.minus(m,n);
        System.out.println("The result is " + doubleDifference);

    }
}
