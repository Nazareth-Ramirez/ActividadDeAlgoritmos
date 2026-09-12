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
public class Menu {
    
     int opcion = 0;
     int metodo = 0;
     
     Nivel1 primero = new Nivel1();
     Nivel2 segundo = new Nivel2();
     Nivel3 tercero = new Nivel3();
     Nivel4 cuarto = new Nivel4();
     Nivel5 quinto = new Nivel5();


     
     public void MenuMetodos(){
         
         while(opcion!=6){
         
          opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite \n1 PARA DESCUBIR EL NIVEL 1 \n2 PARA DESCUBIR EL NIVEL 2 \n3 PARA DESCUBIR EL NIVEL 3 \n4 PARA DESCUBIR EL NIVEL 4 \n5 PARA DESCUBIR EL NIVEL 5 \n6. Salir"));
           switch(opcion){
               
               case 1:
                   metodo=Integer.parseInt(JOptionPane.showInputDialog("Digite \n1 Para averiguar que hace este primer metodo con int \n2 Para saber que hace este segundo metodo con char"));
                   
                   if(metodo==1){
                      primero.metodo3();
  
                   }else if(metodo==2){
                       primero.metodo4();
                       
                   }
                   
               break;  
               
               case 2:
                   
                   metodo=Integer.parseInt(JOptionPane.showInputDialog("Digite \n1 Para averiguar que hace este primer metodo con char \n2 Para saber que hace este segundo metodo con int"));
                   
                   if(metodo==1){
                      segundo.metodo7();
  
                   }else if(metodo==2){
                       segundo.metodo8();
                       
                   }
                   
               break;
               
               case 3:
                   
                   metodo=Integer.parseInt(JOptionPane.showInputDialog("Digite \n1 Para averiguar que hace este primer metodo con int \n2 Para saber que hace este segundo metodo con char"));

                   if(metodo==1){
                      tercero.motodo11();
  
                   }else if(metodo==2){
                       tercero.metodo12();
                       
                   }
                   
                   
               break;
               
               case 4:
                   
                   metodo=Integer.parseInt(JOptionPane.showInputDialog("Digite \n1 Para averiguar que hace este primer metodo con int \n2 Para saber que hace este segundo metodo con int"));

                   if(metodo==1){
                      cuarto.metodo15();
  
                   }else if(metodo==2){
                       cuarto.metodo16();
                       
                   }
                   
               break;
               
               case 5:
                   
                   metodo=Integer.parseInt(JOptionPane.showInputDialog("Digite \n1 Para averiguar que hace este primer metodo con int \n2 Para saber que hace este segundo metodo con int"));

                   if(metodo==1){
                      quinto.metodo19();
  
                   }else if(metodo==2){
                       quinto.metodo20();
                       
                   }
                   
                   
               break;
               
               case 6:
                   
                   JOptionPane.showMessageDialog(null, "Muchas gracias por usar nuestro programa");
                   System.exit(0);
                   
               break;
               
               default:
                   
                 JOptionPane.showMessageDialog(null, "El numero que digito es incorrecto");

               break;
               
           }
             
         }//fin del while
         
     }
             
     
    
}
