package ResolucaoTela;
import java.awt.*;
public class ResolucaoTela {
    public static void main(String[] args) {

        Toolkit tk = Toolkit.getDefaultToolkit();
        int width = (int) tk.getScreenSize().getWidth();
        int height = (int) tk.getScreenSize().getHeight();       
        System.out.println("A resolução da tela do meu sistema é: ");
        System.out.println("Width: " + width + "\nHeight: " + height);
    }
}
