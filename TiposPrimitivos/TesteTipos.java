package TiposPrimitivos;

public class TesteTipos {
    public static void main(String args[]) {
        int idade = 34;
        String valor = Integer.toString(idade);
        System.out.println("A minha idade é: " + valor);

        String ano = "2023";
        int valor2 = Integer.parseInt(ano);
        System.out.println("Estamos no ano de: " + valor2);
    }
}