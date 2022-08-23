package introductionToProgramming.exercise3;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona(22,"Santiago Antia Arce","33333333");
        System.out.println("El nombre de la personas es:\n" + persona.getNombre()+
                "\nla edad de la persona es\n" + persona.getEdad()+
                "\nEl telefono de la persona es:\n" + persona.getTelefono());
    }
}
