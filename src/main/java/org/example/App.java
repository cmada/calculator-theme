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
        double result = calculator.divide(x,y);
        System.out.println(" The result is " + result);
    }
}
