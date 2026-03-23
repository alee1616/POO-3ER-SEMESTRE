package main;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Persona sara = Persona("Sara", "Ruiz", new LocalDate(2007, 8, 22), false);

        System.out.println(sara);

        int edad = Period.between(sara.getFechaNacimiento(), hoy(), getYeaars();
        System.out.println(sara.getNombres() + "Tiene " + edad + " años.");
    }
}
