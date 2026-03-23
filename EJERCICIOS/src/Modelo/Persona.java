package Modelo;

public class Persona {

    /**
     * *Atributos: nombres, apellidos
     * fecha de nacimiento, sexoo
     */

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private bolean sexo;

    /**
     * constructores
     */


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public bolean getSexo() {
        return sexo;
    }

    public void setSexo(bolean sexo) {
        this.sexo = sexo;
    }
}
