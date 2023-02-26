package javabasic.ExcerciseFiguras;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sizeVector = s.nextInt();
        int numValue = 0;
        String number ="";
        int valueTwo=0;
        int[] vector = new int[sizeVector];

        for (int i=0; i<sizeVector; i++){
            vector[i] = s.nextInt();
            numValue = vector[i]%10;
            number += String.valueOf(numValue);
        }
        valueTwo = Integer.parseInt(number);
        System.out.println((valueTwo%10==0)?"Yes":"No");

        /*//System.out.println("ingrese el tamaño del vector");
        int sizeVector = s.nextInt();
        int[] vector = new int[sizeVector];
        int[] vectorNew = new int[sizeVector];
        StringBuilder number = new StringBuilder();
        int numValue;

        for (int i = 0; i < sizeVector; i++) {
            //System.out.println("ingrese el valor del vector en la posicion: " + i + 1);
            vector[i] = s.nextInt();
        }
        for (int j = 0; j < vector.length; j++) {
            vectorNew[j] = vector[j] % 10;
        }
        for (int v : vectorNew) {
            number.append(v);
        }
        numValue= Integer.parseInt(String.valueOf(number));
        System.out.println((numValue%10==0)?"Yes":"No");
*/


        //other way
       /* Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        int a = 0;
        String valores = "";

        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
            a = data[i] % 10;
            valores += String.valueOf(a);
        }

        int valoresDos = Integer.parseInt(valores);
        System.out.println((valoresDos % 10 == 0) ? "Yes" : "No");*/


    }
}
