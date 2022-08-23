package introductionToProgramming.exercise4;

import java.util.concurrent.Flow;

public class Cliente extends Persona{

    private Integer credito;


    public Cliente(Integer credito,String nombre,Integer edad, String telefono) {
        super(edad, telefono, nombre);
        this.credito = credito;
    }

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

}
