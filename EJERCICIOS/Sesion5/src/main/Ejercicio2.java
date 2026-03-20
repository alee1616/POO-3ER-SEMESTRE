package main;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog(" Dime un número"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog(" Dime otro número"));

        int i = inicio + 1;
        String texto = "";

        while(i < fin){
            if(i % 2 == 0){
                long resultado = 1;
                String fact = "";

                int j = 1;
                while(j <= i){
                    resultado *= j;

                    // para la coma
                    if (j < i) {
                        fact += resultado + " , "; // si no es el último, lleva coma
                    } else {
                        fact += resultado;         // si es el último, no lleva coma
                    }

                    j++;
                }

                texto += i + " -> " + fact + "\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}