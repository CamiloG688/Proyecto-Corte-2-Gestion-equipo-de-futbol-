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

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPartidos() {
        return partidosDirigidos;
    }
    public void setPartidos(int partidosDirigidos) {
        this.partidosDirigidos = partidosDirigidos;
    }

    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Arbitro [nombre=" + getNombre() + ", edad=" + getEdad()
                + ", altura=" + getAltura() + ", documento=" + getId()
                + ", categoria=" + categoria + ", partidosDirigidos=" + partidosDirigidos
                + ", calificacion=" + calificacion + ", disponible=" + disponible + "]";
    }
}