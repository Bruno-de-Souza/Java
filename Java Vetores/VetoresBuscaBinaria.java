import java.util.Arrays;

public class VetoresBuscaBinaria {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        System.out.println("Vetor original: ");
        for (int vetor: vet) {
            System.out.print(vetor + " ");
        }
        int p = Arrays.binarySearch(vet,1);
        System.out.println("\nEncontrei o valor de " + 1 + " na posição: " + p);
    }
}
