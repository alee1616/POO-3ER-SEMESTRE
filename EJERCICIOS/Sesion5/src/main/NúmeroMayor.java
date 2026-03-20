package main;

public class NúmeroMayor {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 10;

        // 1. Evaluamos si todos son iguales primero
        if (n1 == n2 && n2 == n3) {
            System.out.println("Todos los números son iguales: " + n1);
        }
        // 2. Si no son iguales, buscamos el mayor
        else {
            int mayor;

            if (n1 >= n2 && n1 >= n3) {
                mayor = n1;
            } else if (n2 >= n1 && n2 >= n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }

            System.out.println("El número mayor es: " + mayor);
        }
    }
}