package introductionToProgramming.exercise1;

public class Coche {

    public Coche() {
    }

    public int numeroDePuertas = 4;

    //Funcion que aumenta el numero de pueras en 1
    public void setNoPuertas(){
        int nuevoNumeroDePuertas= numeroDePuertas+1;
        System.out.println("El nuevo numero de puertas es: " + nuevoNumeroDePuertas);
    }


}
