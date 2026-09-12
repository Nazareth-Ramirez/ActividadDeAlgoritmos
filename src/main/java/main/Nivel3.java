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
public class Nivel3 {
    
    public void metodo9(){
        int[] enteros = new int[10];
        
        enteros[0]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor: "));
        
        int mayor =enteros[0]; //se esta considerando que en el cero esta el mayor
        int menor = enteros[0];
     
        for (int i =1; i<enteros.length; i++){
            
            enteros[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el resto de valores: "));
            
            
            
            //arreglo tiene que ser mayor a la variable mayor
            if (enteros[i] > mayor) {
                mayor = enteros[i];
            }

            //arreglo tiene que ser menor a la variable menor
            if (enteros[i] < menor) {
                menor = enteros[i];
            }
        
        }   
        JOptionPane.showMessageDialog(null, "Mayor: " + mayor);
            JOptionPane.showMessageDialog(null, "Menor: " + menor);
        
//        System.out.println("Mayor: "+ mayor);
//        System.out.println("Menor: "+ menor);
        
        
    }//fin del metodo nueve 
    
}//fin de l clase 
