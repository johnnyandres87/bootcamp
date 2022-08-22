package introductionToProgramming.exercise1;

public class Main {


    public static void main(String[] args) {


        // Parte 1 ejercicio
        var value1 = 1;
        var value2 = 3;
        var value3 = 4;
        System.out.println("Parte 1 ejercicio");
        System.out.println("El valor de la suma de tres numeros es: " + suma(value1, value2, value3));

        // Parte 2 ejercicio
        Coche coche = new Coche();
        System.out.println("Parte 2 ejercicio");
        System.out.println("El numero de puertas del coche es: " + coche.numeroDePuertas);
        coche.setNoPuertas();
    }

    private static double suma(double a, double b, double c) {
        return a + b + c;
    }
}
