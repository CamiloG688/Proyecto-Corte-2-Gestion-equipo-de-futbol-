public class DirectorTecnico extends Persona{
    private String especialidad = null;
    private int añosExperiencia = 0;
    private boolean tieneLicencia = 0;
    private double salario = 0;

    public DirectorTecnico(String nombre) {
        super(nombre);
    }
    public DirectorTecnico(String nombre, int edad) {
        super(nombre, edad);
    }
    public DirectorTecnico(String nombre, int edad, double altura, long documento,String especialidad, int añosExperiencia,double salario, boolean tieneLicencia) {

        super(nombre, edad, altura, documento);

        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.salario = salario;
        this.tieneLicencia = tieneLicencia;
    }
}