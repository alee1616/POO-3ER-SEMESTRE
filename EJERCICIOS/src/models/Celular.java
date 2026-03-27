package models;

public class Celular {
    private String Marca;
    private int Cantidad;
    private double precio;

    public Celular() {

    }

    public Celular(String marca, int cantidad, double precio) {
        Marca = marca;
        Cantidad = cantidad;
        this.precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "Marca='" + Marca + '\'' +
                ", Cantidad=" + Cantidad +
                ", precio=" + precio +
                '}';
    }
}
