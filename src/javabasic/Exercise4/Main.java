package javabasic.Exercise4;

public class Main {

    public static void main(String[] args) {

        System.out.println("Solucion planteada por el ejercicio");
        CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();
        cocheCRUDImpl.save();
        cocheCRUDImpl.findAll();
        cocheCRUDImpl.delete();

        System.out.println("Otra forma de implementar la interfaz");
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.delete();
        cocheCRUD.findAll();
    }
}
