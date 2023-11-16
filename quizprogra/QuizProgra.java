/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author Cynthia Camacho
 */
public class  QuizProgra {
 
    public static void main(String[] args) {
        String nombreIglesia = JOptionPane.showInputDialog("Ingresa el nombre de la iglesia:");
        String nombrePastor = JOptionPane.showInputDialog("Ingresa el nombre del pastor:");
        int numFeligreses = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de Creyentes:"));

        Pastor pastor = new Pastor(nombrePastor);
        Iglesia iglesia = new Iglesia(nombreIglesia, pastor, numFeligreses);
       
        for (int i = 0; i < numFeligreses; i++) {
            String nombreFeligres = JOptionPane.showInputDialog("Ingressa el Nombre del feligrés " + (i + 1) + ":");
            String cedulaFeligres = JOptionPane.showInputDialog("Ingresa la Cédula del feligrés " + (i + 1) + ":");
            double diezmoFeligres = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Diezmo del feligrés " + (i + 1) + ":"));

            Creyentes feligreses = new Creyentes(nombreFeligres, cedulaFeligres, diezmoFeligres);
            iglesia.agregarFeligreses(feligreses);
        }
//Esto es para llamar el arreglo y calcular las ganancia
        iglesia.calcularGanancias();
        iglesia.imprimirInforme();
    }
}

    
       
    

    