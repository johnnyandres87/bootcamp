package introductionToProgramming.exercise4;

public class Trabajador extends Persona{

    private Integer salario;

    public Trabajador(Integer edad, String telefono, String nombre, Integer salario) {
        super(edad, telefono, nombre);
        this.salario = salario;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}
