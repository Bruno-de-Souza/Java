/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;


/**
 *
 * @author bruno
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Hello World!");
        int n, s = 0;
        do {    
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: (O valor 0 interrompe!)"));
        s += n;
    } while (n != 0);
        JOptionPane.showMessageDialog(null, "Resultado FInal e o somatório: " + s);
  }
}
