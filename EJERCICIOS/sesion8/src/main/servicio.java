package main;
import models.Producto;
import models.Servicio;
public class servicio {
    public static void main(String[] args) {
        Producto luz = new Servicio ("Luz", 120, "Mes Marzo", " Eléctrica ");


        luz.setNombre(" Servicio de luz");

        System.out.println(luz);
    }
}
