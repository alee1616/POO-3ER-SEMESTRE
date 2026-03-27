package models;

import java.util.PrimitiveIterator;

public class Tablet extends Producto {
    private String Marca;
    private boolean TieneChip;
    private double  TamañoPantalla;

    public Tablet(double precio, String nombre, int cantidad, String marca,
                  boolean tieneChip, double tamañoPantalla) {
        super(precio, nombre, cantidad);
        Marca = marca;
        TieneChip = tieneChip;
        TamañoPantalla = tamañoPantalla;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public boolean isTieneChip() {
        return TieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        TieneChip = tieneChip;
    }

    public double getTamañoPantalla() {
        return TamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        TamañoPantalla = tamañoPantalla;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "Nombre=" + getNombre()+'\''+
                ",Precio="+ getPrecio()+ '\''+
                ",Cantidad="+ getCantidad()+'\''+
                ",Marca='" + Marca + '\'' +
                ", TieneChip=" + TieneChip +
                ", TamañoPantalla=" + TamañoPantalla +
                '}';
    }
}
