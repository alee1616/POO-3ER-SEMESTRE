package modelo;
import java.time.LocalDate;

public class Persona {

    // 1. Atributos (Privados)
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private boolean sexo; // Corregido: 'boolean' con doble 'o' no existe

    // 2. Constructores

    // Constructor vacío (necesario para muchos frameworks)
    public Persona() {
    }

    // Constructor con todos los parámetros
    public Persona(String nombres, String apellidos, LocalDate fechaNacimiento, boolean sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    // 3. Métodos Getter y Setter
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

    public boolean isSexo() { // Nota: Para booleanos se suele usar 'is' en lugar de 'get'
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    // 4. Método complementario
    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + (sexo ? "Masculino" : "Femenino") +
                '}';
    }
}