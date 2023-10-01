package OperadoresLogicosRelacionais;

public class OperadoresLogicos {
    public static void main(String args[]) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 14;
        boolean resposta;
        resposta =  (x < y && y == z) ? true : false;
        System.out.println(resposta);
    }
}
