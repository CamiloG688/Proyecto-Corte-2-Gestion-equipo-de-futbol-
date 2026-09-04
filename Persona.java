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

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public long getId() {
        return numeroId;
    }
    public void setId(long documento) {
        this.numeroId = documento;
    }
}