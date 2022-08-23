package javabasic.Exercise3;

public class SmartPhone extends SmartDevice{

    private String batery;
    private String operador;
    private String color;
    private String serie;

    public SmartPhone() {
    }


    public SmartPhone(String name, String code, String manufacturer, String batery, String operador,
                      String color, String serie) {
        super(name,code,manufacturer);
        this.batery = batery;
        this.operador = operador;
        this.color = color;
        this.serie = serie;
    }

    public String getBatery() {
        return batery;
    }

    public void setBatery(String batery) {
        this.batery = batery;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
