/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Numeros;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            num = teclado.nextInt();
            s += num;
            System.out.println("Quer Continuar? [S/N]");
            resp = teclado.next();
        } while(resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
