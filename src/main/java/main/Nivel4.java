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
public class Nivel4 {
    
    
    public void metodo15(){
        
        int rotar[] = {1, 2, 3, 4, 5};
        String original = "Orden original: 1,2,3,4,5";
        int resultado2 = 0;
        int ultimoNum = rotar[rotar.length -1];
        
        
        for(int i= rotar.length -1; i>0; i--){
           rotar[i] = rotar[i-1];
              
        }//fin del for
        
        rotar[0]=ultimoNum;
        
        for(int i=0; i<rotar.length; i++){
         resultado2 += rotar[i];
         JOptionPane.showMessageDialog(null, "aqui te mostraremos la retacion que dan estos 5 numeros " +original
                                          + " y el orden rotado ahora es asi: " +rotar[i]);
          
          
        }
  
    }//fin del metodo 15
    
    public void metodo16(){
        
        int num[] = {20, 40, 60, 80, 100};
        int indice1 = 0;
        int indice2 = 0;
        String resultado = "";
        
        indice1=Integer.parseInt(JOptionPane.showInputDialog("Digite uno de estos numero del 0-4 para el primer elegido del intercambia"));
        indice2=Integer.parseInt(JOptionPane.showInputDialog("Digite uno de estos numero del 0-4 para el segundo elegido del intercambia"));
        
          if(indice1 >=0 && indice1<num.length &&indice2 >=0 && indice2<num.length ){ //verificar que los indices no se pasen 
              
              //cambiar de lugar los numeros de los indices
              
              int temporal = num[indice1];
              num[indice1] = num[indice2];
              num[indice2] = temporal;
              
              for(int i=0; i<num.length; i++){
                  resultado += num[i] + ",";
                  
                }
              JOptionPane.showMessageDialog(null, "los numeros estabn organizados asi 20, 40, 60, 80, 100; ahora que elegio el intercambio queda asi " +resultado);
            }
          
        
        
        
    }//fin del metodo 16
    
}
