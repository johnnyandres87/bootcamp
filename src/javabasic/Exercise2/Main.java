package javabasic.Exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.print("Input a value: $");
        String input = inputValue.next();
        try {
            var inputCast = Double.parseDouble(input);
            var endValue = value(inputCast);
            System.out.println("The value of product is: $" + endValue);
        } catch (Exception e) {
            System.out.println("the input value is not valid, end program,¡..." + e.getStackTrace());
        }

    }

    public static double value(double price) {
        var IVA = price * (0.19);
        return price + IVA;
    }
}
