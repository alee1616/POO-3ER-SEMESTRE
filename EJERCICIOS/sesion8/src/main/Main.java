package main;
import models.Producto;
public class Main {

    public static void main(String[] args) {
        Producto cafe = new Producto ();
        cafe.setNombre("CAFÉ");
        cafe.setPrecio(500);
        cafe.setCantidad(5);

        System.out.println(cafe);

        // Creación de un nuevo producto
        Producto Gatorade = new Producto ();
        Gatorade.setNombre("GATORADE");
        Gatorade.setPrecio(70);
        Gatorade.setCantidad(2);

        System.out.println(Gatorade);
    }

}
