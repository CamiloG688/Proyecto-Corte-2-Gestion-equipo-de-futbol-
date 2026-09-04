public class Arbitro extends Persona{
    private String categoria = null;
    private int partidosDirigidos = 0;
    private double calificacion = 0;
    private boolean disponible;

    public Arbitro(String nombre) {
        super(nombre);
    }
    public Arbitro(String nombre, int edad) {
        super(nombre, edad);
    }
    public Arbitro(String nombre, int edad, double altura, long documento,String categoria, int partidosDirigidos,double calificacion, boolean disponible) {

        super(nombre, edad, altura, documento);

        this.categoria = categoria;
        this.partidosDirigidos = partidosDirigidos;
        this.calificacion = calificacion;
        this.disponible = disponible;
    }
}