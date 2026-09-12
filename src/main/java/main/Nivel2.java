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
public class Nivel2 {
    
    public void metodo7(){
        
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        String palabra = "ornitonaringologo"; //palabra asignada
        int contar = 0;
        
        for(int i=0; i<palabra.length(); i++){
            for(char n:vocales){
                if(palabra.charAt(i)==n){
                    contar++;
                }//fin del if
                    
            }//fin del for2
            
        }//fin del for
        JOptionPane.showMessageDialog(null, "la cantidad de vocales que contiene la palabra "+palabra+ " es de " + contar);
        
        
    }//FIN DE METODO7 CON VOCALES
    
    
    
    public void metodo8(){
      
        int numeros[] = new int[15];
        int resultadoPar = 0;
        int resultado = 0;
        int resultadoImpar = 0;
        
        for(int i=0; i<numeros.length; i++){
            
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("digite 15 numeros diferentes por favor"));
            
            resultado += numeros[i]; //para saber la suma de todos lo numeros
            
            
            if(numeros[i]%2==0){  //suma de numeros pares
              resultadoPar += numeros[i];
              
            }else{ //guarda los impares
                resultadoImpar += numeros[i];
                
            }//FIN DEL SEGUNDO IF
            
            
        }//FIN DEL FOR 
        JOptionPane.showMessageDialog(null,"la suma de los numeros pares que digito es de: " +resultadoPar
                                           +"\nla suma de los numeros impares que digito es: " +resultadoImpar
                                           +"\nla suma de todos los numeros digitados es de: " +resultado);
        
        
    }//fin del METODO8 CON LEER 
    
}//fin del nivel 2
