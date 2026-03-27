package models;

public class Servicio extends Producto {
    private String descripcion;
    private String tipo;

    public Servicio() {
    }

    public Servicio(String nombre, double precio, String tipo, String descripcion) {
        super(nombre, precio);
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    public String toString() {
        return "Servicio{" +
                "nombre=" + getNombre() + '\''+
                ", precio=" + getPrecio() + '\''+
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
