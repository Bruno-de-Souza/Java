package OperadoresLogicosRelacionais;

public class ComparçãoString {
    public static void main(String args[]) {
        String nome1 = "Bruno";
        String nome2 = "Bruno";
        String nome3 = new String("Bruno");
        String resposta;

        resposta = (nome1.equals(nome3)) ? "Igual" : "Diferente";
        System.out.println(resposta);
    }
}
