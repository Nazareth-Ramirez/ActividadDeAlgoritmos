/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Nivel5 {
    
    public void metodo17() {

        // hay que crear los dos arreglos de origen con el mismo tamaño
        int[] arreglo1 = {5, 10, 15, 20, 25};
        int[] arreglo2 = {2, 4, 6, 8, 10};

        // crear el tercer arreglo con el mismo tamaño que los anteriores
        int[] arreglo3 = new int[arreglo1.length];

        // recorrer y sumar 
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i] = arreglo1[i] + arreglo2[i];
        }

        //Mostrar el tercer arreglo
        for (int mostrar : arreglo3) {
            JOptionPane.showMessageDialog(null,(mostrar + " "));
        }
        
    }//fin del metodo17
    
    public void metodo18() {

        double[] precios1 = {12.50, 45.00, 8.25, 100.00, 30.00};
        double[] precios2 = {15.00, 40.60, 5.00, 110.00, 33.50};

        double[] diferencias = new double[precios1.length];
        double sumaDiferencias = 0.0;

        for (int i = 0; i < precios1.length; i++) {
            // Calculamos la diferencia
            double resta = precios1[i] - precios2[i];

            // Si la resta dio negativa, la convertimos a positiva
            if (resta < 0) {
                resta = resta * -1;
            }

            diferencias[i] = resta;
            sumaDiferencias += diferencias[i];
        }

        double promedio = sumaDiferencias / diferencias.length;

        
        
        for (int i = 0; i < diferencias.length; i++) {
            JOptionPane.showMessageDialog(null, "Diferencia " + (i + 1) + ": " + diferencias[i]);
        }

        JOptionPane.showMessageDialog(null,"Promedio: " + promedio);

    }//fin dle metodo
    
    
    
    
    
}
