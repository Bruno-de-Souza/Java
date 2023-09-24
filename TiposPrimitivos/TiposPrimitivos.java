package TiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String args[]) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            float nota = teclado.nextFloat();
            //System.out.print("A nota é: " + nota);
            //System.out.println("A nota é: " + nota);
            //System.out.printf("A nota do %s é %.4f \n", nome, nota);
            System.out.format("A nota do %s é %.2f\n", nome, nota);
        }
    }
}
