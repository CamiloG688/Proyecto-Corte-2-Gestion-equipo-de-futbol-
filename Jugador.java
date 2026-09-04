public class Jugador extends Persona{
    private int numeroCamisa = 0;
    private String posicion = "";
    private double salario = 0;
    private boolean capitan;

    public Jugador(String nombre, int edad) {
        super(nombre, edad);
    }
    public Jugador(String nombre, int edad, double altura, long documento) {
        super(nombre, edad, altura, documento);
    }
     public Jugador(String nombre, int edad, double altura, long documento,int numeroCamiseta, String posicion,double salario, boolean capitan) {

        super(nombre, edad, altura, documento);

        this.numeroCamisa = numeroCamiseta;
        this.posicion = posicion;
        this.salario = salario;
        this.capitan = capitan;
    }


    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getCapitan() {
        return capitan;
    }
    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }

}