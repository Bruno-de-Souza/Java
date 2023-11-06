import java.util.Scanner;

public class Vetores02 {
    public static void main(String[] args) {
        String mes [] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", 
        "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int totalDias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};
        int ano = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        ano = teclado.nextInt();
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            totalDias[1] = 29;
            System.out.println("O ano é bissesto!");
        } else {
            totalDias[1] = 28;
            System.out.println("O ano não é bissesto!");
        }
        for (int c = 0; c < mes.length; c++) {
            System.out.println("Ano de " + ano + "," + " mês de " + mes[c] + " tem " + totalDias[c] + " dias ao todo!");
        }
    }
}
