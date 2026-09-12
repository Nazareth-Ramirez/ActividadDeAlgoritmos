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
public class Nivel5 {
    
    public void metodo19(){
    
        int orden[] = new int[5];
        boolean ascendente = true;
        
        
        //se guardan los numeros
        for(int i=0; i<orden.length; i++){
            orden[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite 5 numeros que desee"));
            
        }//fin del for
        
        for(int i=0; i<orden.length -1; i++){ //se determina si son ascendentes o no
             if(orden[i]>orden[i+1]){
                ascendente=false;
             }
        }
        
        
        if(ascendente==true){
            JOptionPane.showMessageDialog(null, "Los numeros que digito estan en orden ascendente");
        }else if(ascendente==false){
           JOptionPane.showMessageDialog(null, "Los numeros que digito no estan en orden ascendente"); 
        }
  
    }//fin del metodo 19
    
    
    public void metodo20(){
        
        int secuencia[] = new int[5];
        boolean igual = true;
                
        for(int i=0; i<secuencia.length; i++){
            secuencia[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un patron de 5 numeros"));

        }//fin del for
        
        
        for(int i=0; i<secuencia.length/2; i++){
            if(secuencia[i]!= secuencia[secuencia.length-1-i]){
                igual=false;
                
            }//fin del if
            
        }//fin del for
        
        if(igual==true){
          JOptionPane.showMessageDialog(null, "el numero que ud digito es una capicua");  
        }else if(igual==false){
          JOptionPane.showMessageDialog(null, "el numero que ud digito no es una capicua");  
        }
        
        
    }//fin del metodo 20 y ultimo
    
}//fin del nivel 5
