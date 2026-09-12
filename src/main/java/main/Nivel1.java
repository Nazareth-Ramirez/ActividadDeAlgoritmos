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
public class Nivel1 {
    
    //metodos nivel basico
    public void metodo1(){
        
        double[] numeros = {8.5,9.2,7.4,6.0};
        
        JOptionPane.showMessageDialog(null, "La longitu es de: "+ numeros.length+ "\nEl ultimo elemento es: "+ numeros[3] );
        
//        System.out.println("La longitu es de: "+ numeros.length);
//        System.out.println("El ultimo elemento es: "+ numeros[3]);
        
    }//fin del metodo1
    
    
    public void metodo2(){
        boolean[] valores={true, true, false, true, false,false};
        
        for(int i=0; i<valores.length; i++){
            
            JOptionPane.showMessageDialog (null, "["+ i + "]= "+ valores[i]);
            
//            System.out.println("["+ i + "]= "+ valores[i]);
        }//fin del for
        
    }//fin del metodo2
    
    
    
    
    
    
    
    
}//fin de la clase1
