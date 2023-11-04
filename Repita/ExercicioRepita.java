package ExercicioRepita;
import java.util.Scanner;

public class ExercicioRepita {

public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   int n = 1, s = 0, conta = 0, p = 0, i = 0, ac = 0, me = 0;
   if (n != 0) {
         do {
      System.out.println("Digite um valor: ");
      n = teclado.nextInt();
      s += n;
      conta ++;
      if (n % 2 == 0 ) {
         p++;
      } else {
         i++;
      }
      if (n >= 100) {
         ac++;
      }
      me = s / conta;

      System.out.println("Total de valores inseridos: " + conta + "\nTotal de valores pares: "+ p + "\nTotal de valores ímpares: " + i + 
      "\nVaçores acima de 100: " + ac + "\nMédia dos valores: " + me);
   }     while (n != 0);
   }
}
}