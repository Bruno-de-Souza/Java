package CalculoFatorial;

public class CalculoFatorial {
    public static void main(String[] args) {
        int f = 1;
        int n = 12;
        for (int i = 1; i < n; i++) {
            f *= i;
        }
        System.out.println("O fatorial de " + n + "é igual a " + f);
    }
}
