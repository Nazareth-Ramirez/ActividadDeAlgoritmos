/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author yaris
 */
public class Nivel1 {
    
    public void metodo3(){  //muestar en orden los numeros que digito
        
        int numeros[] = new int[8];
        String resultado = "";
        
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("digite cualalquier numero para guardar"));
            resultado += numeros[i] + ",";
            
            
        }//FIN DEL FOR
        JOptionPane.showMessageDialog(null, "los numeros que digito fueron: "+resultado);
        
    }//fin del metodo3 con int
    
    
    
    public void metodo4(){   //cuenta cuantas letras tiene la palabra asignada
        
        char nombres[] = {'y', 'a', 'r', 'i', 'l', 'i', 's'};
        
        for(int i=0; i<nombres.length; i++){
             JOptionPane.showMessageDialog(null, "la letra "+ (i+1)+ ": " +nombres[i]);
            
        }//fin del for
        
    }//fin del metodo4 con char
    
    
}//fin del nivel1
