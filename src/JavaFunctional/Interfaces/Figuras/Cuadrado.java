package JavaFunctional.Interfaces.Figuras;

public class Cuadrado implements IfiguraGeometrica{

    Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Cuadrado(){}

    @Override
    public Double calculaArea() {
        return lado*lado;
    }

    @Override
    public Double calculaPerimetro() {
        return 4*lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
