package main;


import javax.swing.*;
import java.util.Scanner;

public class VariableReferencia {

    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        //System.out.print("Dime tu nombre: ");
        //String nombre = leer.nextLine();
        //System.out.println("El nombre es: +nombre");
        String nombre = JOptionPane.showInputDialog("Dime tu nombre.");
        String mensaje = " Hola " + nombre;

        JOptionPane.showMessageDialog(null, mensaje+ "Hola, Bienvenido a la Uam ");
    }
}
