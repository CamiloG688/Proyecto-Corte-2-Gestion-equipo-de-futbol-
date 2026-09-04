public class Persona{
    private String nombre = null;
    private int edad = 0;
    private double altura = 0;
    private long numeroId = 0;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String nombre, int edad, double altura, long documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.numeroId = documento;
    }
}