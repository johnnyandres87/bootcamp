package javabasic.ExcerciseStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Smallest {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] strArr = new String[(s.length() - (k - 1))];
        for (int i = 0; i < strArr.length; i++)
            strArr[i] = s.substring(i, i + k);
        // Arrays.sort(strArr);
        //sort array manually
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        smallest = strArr[0];
        largest = strArr[strArr.length - 1];
        return smallest + "\n" + largest;
    }
}
