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
    
    
    
    
    
}
