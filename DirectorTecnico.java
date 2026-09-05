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

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getLicencia() {
        return tieneLicencia;
    }
    public void setLicencia(boolean tieneLicencia) {
        this.tieneLicencia = tieneLicencia;
    }

    @Override
    public String toString() {
    return "DirectorTecnico [nombre=" + getNombre() + ", edad=" + getEdad()
            + ", altura=" + getAltura() + ", documento=" + getId()
            + ", especialidad=" + especialidad + ", anosExperiencia=" + añosExperiencia
            + ", salario=" + salario + ", tieneLicencia=" + tieneLicencia + "]";
}

}