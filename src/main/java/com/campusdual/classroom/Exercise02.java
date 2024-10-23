package com.campusdual.classroom;

public class Exercise02 {

    public static void main(String[] args) {
        double r = 15;
        double a, l;
        double numeroPi = 3.1416;

        //  ↓ Fórmula del área de un círculoS: a = radio * radio * Número PI
        a = r * r * numeroPi;

        System.out.println("Area: " + a);

        // ↓ Fórmula de la longitud de una circunferencia: l = 2 * radio * Número PI

        l = 2 * r * numeroPi;

        System.out.println("Longitud:  " + l);

    }
}
