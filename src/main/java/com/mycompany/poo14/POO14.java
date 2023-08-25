/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo14;

/**
 *
 * @author Juliana
 */
//EJERCICIO PROPUESTO #14
import java.util.Scanner;
public class POO14 {
    public static void main(String[] args) {
        double numero, cuadrado, cubo;
        System.out.println("Ingrese un numero:"); //Ingreso del numero
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextDouble(); //numero
        cuadrado = Math.pow(numero, 2); //cuadrado del numero
        cubo = Math.pow(numero, 3); //cubo del numero
        System.out.println("Numero dado : " + numero);
        System.out.println("Cuadrado del numero : " + cuadrado);
        System.out.println("Cubo del numero : " + cubo);
    }
}
