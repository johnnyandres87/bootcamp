package introductionToProgramming.exercise4;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Cliente(10000,"Juan Perez",25,"33333333");
        Persona trabajador = new Trabajador(25,"33333333","Pedro Perez",1000000);

        System.out.println("El nombre del cliente es: " + persona.getNombre());
        System.out.println("El nombre del trabajador es:" + trabajador.getNombre());
    }
}
