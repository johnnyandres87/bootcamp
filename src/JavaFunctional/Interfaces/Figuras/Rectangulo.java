package JavaFunctional.Interfaces.Figuras;

public class Rectangulo implements  IfiguraGeometrica{

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo (){}

    @Override
    public Double calculaArea() {
        return base*altura;
    }

    @Override
    public Double calculaPerimetro() {
        return 2*(base*altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
