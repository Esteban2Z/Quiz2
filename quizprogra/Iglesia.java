/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizprogra;

/**
 *
 * @author Cynthia Camacho
 */
public class Iglesia {
    private String nombre;
    private Pastor pastor;
    private Creyentes feligreses[];
    private double gananciasTotales;
    private double gananciasPastor;
    private double impuestoMunicipal;
    private double impuestoComedor;
    private double impuestosTotales;
    private int indice = 0;

    public Iglesia(String nombre, Pastor pastor, int numFeligreses) {
        this.nombre = nombre;
        this.pastor = pastor;
        this.feligreses = new Creyentes[numFeligreses];
    }

    public void agregarFeligreses(Creyentes feligreses1) {
        feligreses[indice] = feligreses1;
        indice++;
    }

    public void calcularGanancias() {
        for (Creyentes feligres : feligreses) {
            if (feligres != null) {
                gananciasTotales += feligres.Diezmo();
            }
        }
        //Estas dos lineas hacen los calculos de impestos al monto total
        impuestoMunicipal = gananciasTotales * 0.09;
        impuestoComedor = gananciasTotales * 0.21;
        impuestosTotales =  impuestoComedor + impuestoMunicipal;
        gananciasPastor = gananciasTotales - impuestosTotales;
    }
//Estos son un monton de prints haciendo un resumen de todos los datos de una sola iglesia
    public void imprimirInforme() {
        System.out.println("Informe de la Iglesia " + nombre);
          //Esto es para devlver el nombre del pastor
        System.out.println("Pastor a cargo: " + pastor.Nombre());
        System.out.println("Ganancias del pastor: " + gananciasTotales);
        System.out.println("Impuesto para infraestructura municipal: " + impuestoMunicipal);
        System.out.println("Impuesto para el comedor municipal: " + impuestoComedor);
    }
}

