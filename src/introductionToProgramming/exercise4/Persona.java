package introductionToProgramming.exercise4;

public abstract class Persona {

    private Integer edad;
    private String telefono;
    private String nombre;

    public Persona(){

    }

    public Persona(Integer edad, String telefono, String nombre) {
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
