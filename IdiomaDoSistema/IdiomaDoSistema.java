package IdiomaDoSistema;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        System.out.println("O páis e idioma do meu sistema é: ");
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));
    }
}
