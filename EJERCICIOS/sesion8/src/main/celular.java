package main;
import models.Celular;
public class celular {

    public static void main(String[] args) {
        Celular samsung = new Celular();

        samsung.setMarca("SAMSUNG S20 FE 5G");
        samsung.setPrecio(1200.50);
        samsung.setCantidad(12);

        System.out.println(samsung);
    }

}
