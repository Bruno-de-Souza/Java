package EstruturaDeRepetição;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;
            if(cc == 1 || cc == 3 || cc == 5) {
                continue;
            }
            if(cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}