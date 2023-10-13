package EstruturasCondicionais.EstruturaCompostas;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String arg []) {
        try (Scanner teclado = new Scanner(System.in);) {
            System.out.println("Digite a sua data de nascimento: ");
            int nascimento = teclado.nextInt();
            int idade = 2023 - nascimento;
            System.out.println("Sua idade é: " + idade + " anos");
            if( idade >= 18) {
                System.out.println("Maior de idade!");
            } else {
                System.out.println("Menor de idade!");
            }
        }
    }
}
 