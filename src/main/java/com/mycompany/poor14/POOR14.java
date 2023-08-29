/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poor14;

/**
 *
 * @author Juliana
 */
//EJERCICIO RESUELTO #14
import java.util.Scanner;
public class POOR14 {
    public static void main(String[] args) {
        double vd1, vd2, vd3, salar, totven, porven, salar1, salar2, salar3;
        
        System.out.println("Ventas del departamento 1:"); //Ingreso
        Scanner ventas1 = new Scanner(System.in);
        vd1 = ventas1.nextDouble(); //Ventas 1
        
        System.out.println("Ventas del departamento 2 :"); //Ingreso 
        Scanner ventas2 = new Scanner(System.in);
        vd2 = ventas2.nextDouble(); //Ventas 2
        
        System.out.println("Ventas del departamento 3 :"); //Ingreso 
        Scanner ventas3 = new Scanner(System.in);
        vd3 = ventas3.nextDouble(); //Ventas 3
        
        System.out.println("Salario :"); //Ingreso valor hora  trabajada
        Scanner valor = new Scanner(System.in);
        salar = valor.nextDouble(); //salario
        
        totven=vd1+vd2+vd3;
        porven=0.33*totven;
        if (vd1 > porven){
            salar1= salar + 0.2 * salar;
        }
        else{
            salar1=salar;
        }
        if (vd2 > porven){
            salar2=salar + 0.2 * salar;
        }
        else{
            salar2=salar;
        }
        if (vd3 > porven){
            salar3 = salar + 0.2 * salar;
        }
        else{
            salar3= salar;
        }
        
        System.out.println("Salario vendedores apto 1 : " + salar1);
        System.out.println("Salario vendedores apto 2: " + salar2);
        System.out.println("Salario vendedores apto 3: " + salar3);
    }
}

