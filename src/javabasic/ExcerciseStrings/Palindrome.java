package javabasic.ExcerciseStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("ingrese un valor");
        String a = sc.nextLine();
        int lengthA = a.length();
        int lengthB = lengthA-1;
        String [] vectorA = new String[lengthA];
        String [] vectorB = new String[lengthA];
        for(int i = 0; i<lengthA; i++)
        {
            vectorA[i]=String.valueOf(a.charAt(i));
        }
        for (int j =0; j<lengthA; j++)
        {
            vectorB[j]=String.valueOf(a.charAt(lengthB));
            lengthB--;
        }
        System.out.println((Arrays.equals(vectorA,vectorB))?"Yes":"No");
    }
}
