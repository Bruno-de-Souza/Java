import java.util.Arrays;

public class VetoresFill {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int valor: v) {
            System.out.print(valor + " ");
        }
    }
}
