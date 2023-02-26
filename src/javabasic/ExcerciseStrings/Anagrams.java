package javabasic.ExcerciseStrings;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        System.out.println((isAnagram("anagram", "margana")) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        boolean status = false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length()!=b.length())
        {
            return status;
        }
        else {
                a = Ordenar(a);
                b = Ordenar(b);
                status = a.equals(b);
            }

        return status;
    }

    private static String Ordenar (String cadena){
        char[]caracteres = cadena.toCharArray();
        Arrays.sort(caracteres);
        return new String(caracteres);
    }
}
