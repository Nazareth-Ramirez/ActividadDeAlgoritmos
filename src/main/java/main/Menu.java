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
public class Menu {
    
    public void menuPrincipal() {
    int opcion = 0;
    int opcionMenuInterno = 0;

    Nivel1 nive1 = new Nivel1();
    Nivel2 nive2 = new Nivel2();
    Nivel3 nive3 = new Nivel3();
    Nivel4 nive4 = new Nivel4();
    Nivel5 nive5 = new Nivel5();

    do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "--- MENÚ PRINCIPAL ---\n"
                + "1. Nivel 1\n"
                + "2. Nivel 2\n"
                + "3. Nivel 3\n"
                + "4. Nivel 4\n"
                + "5. Nivel 5\n"
                + "6. Salir"));
           

        switch (opcion) {
            case 1:
                do {
                    opcionMenuInterno = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "--- NIVEL 1 ---\n"
                        + "1. Algoritmo 1\n"
                        + "2. Algoritmo 2\n"
                        + "6. Volver al menú principal"));

                    switch (opcionMenuInterno) {
                        case 1:
                            nive1.metodo1();
                            break;
                        case 2:
                            nive1.metodo2();
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inexistente.");
                    }
                } while (opcionMenuInterno != 6);
                break;

            case 2:
                do {
                    opcionMenuInterno = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "--- NIVEL 2 ---\n"
                        + "1. Algoritmo 1\n"
                        + "2. Algoritmo 2\n"
                        + "6. Volver al menú principal"));

                    switch (opcionMenuInterno) {
                        case 1:
                            nive2.metodo5();
                            break;
                        case 2:
                            nive2.metodo6();
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inexistente.");
                    }
                } while (opcionMenuInterno != 6);
                break;

            case 3:
                do {
                    opcionMenuInterno = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "--- NIVEL 3 ---\n"
                        + "1. Algoritmo 1\n"
                        + "2. Algoritmo 2\n"
                        + "6. Volver al menú principal"));

                    switch (opcionMenuInterno) {
                        case 1:
                            nive3.metodo9();
                            break;
                        case 2:
                            nive3.metodo10();
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inexistente.");
                    }
                } while (opcionMenuInterno != 6);
                break;

            case 4:
                do {
                    opcionMenuInterno = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "--- NIVEL 4 ---\n"
                        + "1. Algoritmo 1\n"
                        + "2. Algoritmo 2\n"
                        + "6. Volver al menú principal"));

                    switch (opcionMenuInterno) {
                        case 1:
                            nive4.metodo13();
                            break;
                        case 2:
                            nive4.metodo14();
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inexistente.");
                    }
                } while (opcionMenuInterno != 6);
                break;

            case 5:
                do {
                    opcionMenuInterno = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "--- NIVEL 5 ---\n"
                        + "1. Algoritmo 1\n"
                        + "2. Algoritmo 2\n"
                        + "6. Volver al menú principal"));

                    switch (opcionMenuInterno) {
                        case 1:
                            nive5.metodo17();
                            break;
                        case 2:
                            nive5.metodo18();
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inexistente.");
                    }
                } while (opcionMenuInterno != 6);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción inexistente, escoja una del menu");
        }

    } while (opcion != 6);
}
    
    
}
