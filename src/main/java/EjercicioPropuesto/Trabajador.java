package EjercicioPropuesto;


public class Trabajador {
    String nombre;
    String paterno;
    String materno;
    int sueldoBase;
    int ventasRealizadas;
    String estadoCivil;
    int numHijos;

    public Trabajador(String nombre, String paterno, String materno, int sueldoBase, int ventasRealizadas, String estadoCivil, int numHijos) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.ventasRealizadas = ventasRealizadas;
        this.estadoCivil = estadoCivil;
        this.numHijos = numHijos;
    }
    
    public int sueldoNeto(int comisionVentas, int descInpuestos, int descSeguro){
        return getSueldoBase() + comisionVentas - descInpuestos - descSeguro;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    
    
    
    
    
    
}
