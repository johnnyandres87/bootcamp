package javabasic.ExcerciseStrings;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("ingrese la primer palabra");
        String a = sc.nextLine();
        String a1;
        //System.out.println("ingrese la segunda palabra");
        String b = sc.nextLine();
        String b1;

        //Realizar la suma de dos strings:
        int sum = a.length() + b.length();
        //write Yes if  is lexicographically greater than  otherwise print No instead.
        System.out.println((a.compareTo(b)>0?"no":""));
        //
        a1 = a.substring(0,1).toUpperCase()+a.substring(1);
        b1 = b.substring(0,1).toUpperCase()+b.substring(1);
        System.out.println(a1+" "+b1);
    }
}
