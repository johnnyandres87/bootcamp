package introductionToProgramming.exercise2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Sentencia if\n" +
                    "2. Ciclo While\n" +
                    "3. Ciclo doWihile\n" +
                    "4. Ciclo for\n" +
                    "5. Estaciones del año");
            Integer value = selectValue();
            switch (value) {
                case 1:
                    System.out.println("Bienvenido a la sentencia de control if");
                    System.out.println("Ingrese un valor numerico");
                    var inputCase1 = selectValue();
                    sentenceIf(inputCase1);
                    break;
                case 2:
                    System.out.println("Bienvenido al cilo while");
                    System.out.println("Ingrese un valor numerico menor que 3");
                    var inputCase2 = selectValue();
                    if (inputCase2 < 3) {
                        useWhile(inputCase2);
                    } else {
                        System.out.println("debe ingresar un valor menor que 3");
                    }
                    break;
                case 3:
                    System.out.println("Bienvenido al cilo do while");
                    System.out.println("Ingrese un valor numerico menor que 3");
                    var inputCase3 = selectValue();
                    if (inputCase3 < 3) {
                        useDoWhile(inputCase3);
                    } else {
                        System.out.println("debe ingresar un valor menor que 3");
                    }
                    break;
                case 4:
                    System.out.println("Bienvenido al cilo for");
                    useFor();
                    break;
                case 5:
                    System.out.println("Bienvenido al programa de estaciones");
                    System.out.println("ingrese una estacion del 1 al 4");
                    var station = selectValue();
                    switch (station) {
                        case 1:
                            System.out.println("Estacion primavera");
                            break;
                        case 2:
                            System.out.println("Estacion verano");
                            break;
                        case 3:
                            System.out.println("Estacion otoño");
                            break;
                        case 4:
                            System.out.println("Estacion Invierno");
                            break;
                        default:
                            System.out.println("verifique su valor");
                            break;
                    }
                    break;
                default:
                    System.out.println("debe ingresar un valor valido");
                    break;
            }

        } catch (NumberFormatException nE) {
            System.out.println("debe seleccionar un valor valido " + nE);
        }

    }

    private static int selectValue() {
        Scanner scan = new Scanner(System.in);
        var input = Integer.parseInt(scan.next());
        return input;
    }

    private static void sentenceIf(Integer value) {
        if (value >= 0) {
            System.out.println("El valor: " + value + " es positivo");
        } else {
            System.out.println("El valor: " + value + " es negativo");
        }

    }

    private static void useWhile(Integer value) {
        while (value < 3) {
            System.out.println("El valor es: " + value);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            value++;
        }
    }

    private static void useDoWhile(Integer value) {
        do {
            System.out.println("El valor es:" + value);
            value = 3;
        } while (value < 3);
    }

    private static void useFor() {

        for (var numeroFor = 0; numeroFor <= 3; ) {
            System.out.println("El valor en la iteracion" + (numeroFor + 1) + " es: " + numeroFor);
            numeroFor++;
        }
    }

}
