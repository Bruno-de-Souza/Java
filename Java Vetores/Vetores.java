public class Vetores {
    public static void main(String[] args) {
        /*int n [] = new int[4];
        n [0] = 3;
        n [1] = 5;
        n [2] = 7;
        n [3] = 9;

        System.out.println("Total de casas de N: " + n.length);*/

        int n [] = {3, 5, 7, 9, 11, 13};
        System.out.println("Total de casas do vetor N: " + n.length + "\n");
        for (int c = 0; c <= n.length - 1; c++) {
            System.out.println("Na posição " + c + " temos o valor de " + n[c]);
        }
    }
}