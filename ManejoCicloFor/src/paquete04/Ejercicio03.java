/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        
        int num;

        for (num = 1; num <= 5; num++) {
            for (int contador = 1; contador <= num; contador++) {

                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        for (num = 5; num >= 1; num--) {
            for (int contador = 1; contador <= num; contador++) {

                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
