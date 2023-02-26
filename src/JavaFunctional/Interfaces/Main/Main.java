package JavaFunctional.Interfaces.Main;

import JavaFunctional.Interfaces.Figuras.Cuadrado;
import JavaFunctional.Interfaces.Figuras.IfiguraGeometrica;
import JavaFunctional.Interfaces.Figuras.Rectangulo;

public class Main {


    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(2.0);
        Rectangulo rectangulo = new Rectangulo(2.0, 3.0);

        System.out.println("El area del cuadrado es:" + cuadrado.calculaArea());
        System.out.println("El area del rectangulo es:" + rectangulo.calculaArea());

        //Clases Anonimas
        IfiguraGeometrica circulo = new IfiguraGeometrica() {
            int radio = 5;

            @Override
            public Double calculaArea() {
                return Math.PI * (radio * radio);
            }

            @Override
            public Double calculaPerimetro() {
                return 2* Math.PI * radio;
            }
        };
        System.out.println("El area del circulo es:" + circulo.calculaArea());
        System.out.println("El perimetro del circulo es:" + circulo.calculaPerimetro());


    }
}
