package EstruturasCondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String args[]) {
        try (Scanner teclado = new Scanner(System.in);) {
            System.out.print("Aluno, digite a primeira nota: ");
            float n1 = teclado.nextFloat();
            System.out.print("Aluno, digite a segunda nota: ");
            float n2 = teclado.nextFloat();
            float media = (n1 + n2) / 2;
            System.out.println("Sua média foi " + media);

            if(media >= 9) {
                System.out.println("Parabéns, pequeno gafanhotinho!");
            }
        }
    }
}