package javabasic.Exercise3;

public class SmartWatch extends SmartDevice{

    private String batery;
    private String color;
    private String serie;

    public SmartWatch() {
    }

    public SmartWatch(String name, String code, String manufacturer, String batery, String color, String serie) {
        super(name, code, manufacturer);
        this.batery = batery;
        this.color = color;
        this.serie = serie;
    }

    public String getBatery() {
        return batery;
    }

    public void setBatery(String batery) {
        this.batery = batery;
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
