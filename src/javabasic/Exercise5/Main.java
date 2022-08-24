package javabasic.Exercise5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------Invierte String---------");
        reverse("hola mundo");

        System.out.println("\n--------Recorre array unidimensional---------");
        recorreArray();

        System.out.println("--------Recorre array bidimensional---------");
        recorreArrayBidimensional();

        System.out.println("\n --------Vector---------");
        vector();

        System.out.println("\n --------ArrayString---------");
        arrayListString();

        System.out.println("\n --------ArrayInteger---------");
        arrayInt();

        System.out.println("\n --------Division por cero---------");
        try {
            dividePorCero();
        }catch (ArithmeticException ae)
        {
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("demo de code1");
        }

    }

    public static String reverse(String texto) {
        var reverseString = texto;
        char[] reverseChar = reverseString.toCharArray();

        for (int i = reverseChar.length - 1; i >= 0; i--) {
            System.out.print(reverseChar[i]);
        }

        return reverseString.toString();

    }

    private static void recorreArray() {
        String[] miArray = {"juan", "pedro", "jose"};

        for (String array : miArray) {
            System.out.println("El valor es: " + array);
        }
    }

    private static void recorreArrayBidimensional() {
        int[][] arrayInt = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                arrayInt[i][j] = (int) (Math.random() * 10 + 1);

            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.print("|" + arrayInt[i][j] + "|");
            }
        }
    }

    private static void vector() {

        Vector<Persona> vector = new Vector<>();
        vector.add(new Persona("Manolo", "Galvan", 15));
        vector.add(new Persona("Juan", "Perez", 25));
        vector.add(new Persona("Hernan", "Hernandez", 35));
        vector.add(new Persona("Gregorio", "Solano", 26));
        vector.add(new Persona("Pilar", "Dominguez", 33));
        vector.add(new Persona("Eliana", "Garcia", 55));

        System.out.println("------Vector antes de eliminar----------------");
        for (Persona index : vector) {

            System.out.println("El valor del objeto:" + index.toString());

        }

        vector.remove(2);
        vector.remove(3);

        System.out.println("------Vector despues de eliminar----------------");
        for (Persona index : vector) {

            System.out.println("El valor del objeto persona es:" + index.toString());

        }


    }

    private static void arrayListString() {
        ArrayList<String> myArray = new ArrayList<>();
        LinkedList<String> myLinkedList = new LinkedList<>();

        myArray.add("Juan");
        myArray.add("Pedro");
        myArray.add("Jose");
        myArray.add("Agonia");

        myArray.forEach(array -> {
            myLinkedList.add(array);
        });

        myLinkedList.forEach(list -> System.out.println("El valor en el linkedList es: " + list));

    }

    private static void arrayInt() {
        ArrayList<Integer> myArray = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            myArray.add(i + 1);
        }

        myArray.removeIf(value -> (value % 2 == 0));
        myArray.forEach(System.out::println);
    }

    private static void dividePorCero() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor para divivir");
        var a = scanner.nextInt();
        System.out.println("Ingrese el primer valor para divivir");
        var b = scanner.nextInt();
        System.out.println("El resultado es: " + (a/b));

    }
}
