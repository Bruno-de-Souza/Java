//Estrutura de repetição For aninhado
public class EstruturaAninhada {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("J" + j);
            }
            System.out.println("I" + i);
        }
    }
}
