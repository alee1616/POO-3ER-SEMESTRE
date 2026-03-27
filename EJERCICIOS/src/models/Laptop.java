package models;

public class Laptop {
    private String Marca;
    private int cantidad;
    private double precio;

    public Laptop () {

    }

    public Laptop (String marca, int cantidad, double precio) {
        Marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Marca='" + Marca + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
