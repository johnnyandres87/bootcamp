package javabasic.ExcerciseStrings;

import java.util.Scanner;

public class Splits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String[] resultado = a.split("[ ,!?._'@]+");
        System.out.println(resultado.length);
        for(String value:resultado){
            System.out.println(value);
        }
    }
}
