package javabasic.Exercise3;

public abstract class SmartDevice {

    private String name;
    private String code;
    private String manufacturer;

    public SmartDevice() {
    }

    public SmartDevice(String name, String code, String manufacturer) {
        this.name = name;
        this.code = code;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
