/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Nivel4 {
    
    public void metodo13(){
        int[] datos= {1,2,3,4,5,6,7,8,9,10};
        
        for (int i=0; i<datos.length/2; i++){//el dos es para que llegue hasta la mitad
            int auxiliar=datos[i];
            
            datos[i]= datos[datos.length -1 -i]; //el datos.length -1, es el que da el ultimo inidce valido del arreglo, osea 9, y el -i, resta el avance del ciclo
            
            datos[datos.length -1 -i]=auxiliar;//para invertir
            
        }
        
        for (int v:datos){
            JOptionPane.showMessageDialog(null, v+"");
        }
        
        
    }//fin del metodo
    
    
    public void metodo14(){
        
        int[] original= {1,2,3,4,5,6,7,8,9,10};
        int[] copia=new int[original.length];
        
        for(int i=0; i<original.length;i++){
            copia[i]=original[i];
        }
        
        copia[1]=77;
        JOptionPane.showMessageDialog(null, "original[1]: "+ original[1]+ "\ncopia[1]: "+copia[1] );
        
        
        int[] copia2= Arrays.copyOf(original, original.length);
        
        
    }//fin del metodo 14
    
    
}//fin de la clase
