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
public class Nivel3 {
    
     public void motodo11(){
        
        int num[] = new int[12];
        int valor = 0;
        int suma = 0;
        
        for(int i=0; i<num.length; i++){
            num[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite 12 numeros sabiendo que puede repetir numeros ya puestos "));
            
        }//fin del for para guardar los numeros
       
            valor=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor que desea encontar y le diremos la cantidad de veces que sale"));
            
        for(int i=0; i<num.length; i++){    //para sumar y guardar las veces que se repite un numero
            if(num[i]==valor){
                suma++;
            }
                
        }//fin del for para sumar valores
        JOptionPane.showMessageDialog(null, "El numero que usted elegia saber es: " +valor+ " y la veces que sale esa numero en la lista que nos1 dia es de: "+suma);
        
    }//fin del metodo 11 leer y valor
     
     
    
    public void metodo12(){
        
        
        String texto = "ornitorrinco*.;";
        char palabras[] = texto.toCharArray();
        
        int contVocales = 0;
        int contConso = 0;
        int contSimbo = 0;
                
                
        for(int i=0; i<palabras.length; i++){
            char t= Character.toLowerCase(palabras[i]);
            if(palabras[i]=='a' ||palabras[i]=='e' ||palabras[i]=='i' ||palabras[i]=='o' ||palabras[i]=='u'){
                contVocales++;
                
                   
            }else if(t>= 'a' && t<= 'z'){
                contConso++;
                
            }else{
                contSimbo++;
                
            }
            
            
        }//fin del for
        JOptionPane.showMessageDialog(null, "la palabra " +texto+ " contiene: "
                                      +contVocales+ " vocales, " 
                                      +contConso+ " consonantes y "
                                      +contSimbo+ " simbolos"
                                      );
            
        
        
        
    }//FIN DEL METODO12 CONTAR VOCALES, CONSONANTES Y SIMBOLOS
    
    
}
