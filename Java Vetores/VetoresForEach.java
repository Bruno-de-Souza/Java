import java.util.Arrays;

public class VetoresForEach {
    public static void main(String[] main) {
        int n[] = {3, 5, 1, 8, 4};
        Arrays.sort(n);
        System.out.println("O valor do vetor n ordenado é: ");
        for (int valor: n) {
            System.out.print(valor + ", ");
        }
        System.out.println("\nO tamnaho do vetor n[] é: " + n.length);
    }
}
