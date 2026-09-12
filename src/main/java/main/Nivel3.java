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
    
    
    public void metodo10() {
        int[] enteros = new int[10];

        // hay que llenar rl arreglo con 10 enteros
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: "));
        }

        // Debemos solicitar el número a buscar
        int buscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número que desea buscar:"));

        // Inicializar la posición en -1 (asumiendo por defecto que no existe)
        int posicion = -1;

        // Búsqueda lineal, se refier a recorrer el arreglo para encontrar la primera aparición
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == buscar) {
                posicion = i; // Guardamos la primera posición encontrada

            }
        }

        if (posicion != -1) {
            JOptionPane.showMessageDialog(null, "El número " + buscar + " se encuentra en la posición del índice: " + posicion);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado: " + posicion + " El número no existe en el arreglo");
        }

    }//fin del metodo10
    
    
    
    
    
}//fin de l clase 
