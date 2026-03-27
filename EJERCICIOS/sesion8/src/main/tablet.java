package main;
import models.Tablet;
import models.Producto;
public class tablet {

    public static void main(String[] args) {

        Producto galaxyTab = new Tablet(779.9,
                "Galaxy Tab A", 10, "Samsung", false, 12);

        System.out.println(galaxyTab);
    }
}
