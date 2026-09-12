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
public class Nivel2 {
    
    //Nivel intertmedio-basico
    public void metodo5(){
        
        double[] numerosDeci = new double[8];
        double suma=0.0;
        
        //hacer la suma
        for(int i = 0; i<numerosDeci.length; i++){
            
            numerosDeci[i]= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero decimal: "));
            suma+=numerosDeci[i];
     
        }
        
        double promedio = suma/numerosDeci.length;
        
        JOptionPane.showMessageDialog (null, "Promedio " + String.format ("%.2f%n " , promedio ));
    }//fin del metodo5
    
    
    
    public void metodo6() {
        boolean[] asistencia = {true, true, false, true, true, false, true, true, true, false, true, true, false, false, true,
            true, false, true, true, true};

        int asistieron = 0;
        int faltaron = 0;

        // Contar asistencias y ausencias
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i]==true) {
                asistieron++;
            } else {
                faltaron++;
            }//fin del else
            
        }//fin del for

        // Calcular porcentaje formula: (asistieron / total * 100)
        double porcentaje = ((double) asistieron /asistencia.length) * 100;//el double(asistieron) es para que considere el numero como un decimal, y el porcentaje no sea 0.00%

        //mandar el mensaje
        JOptionPane.showMessageDialog(null, "Asistieron: " + asistieron + "\nFaltaron: " + faltaron
                + String.format("\nPorcentaje de asistencia: %.2f%%", porcentaje));
    }//fin del metodo
    
    
    
    
}//fin de la clase
