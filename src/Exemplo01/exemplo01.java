package Exemplo01;

public class exemplo01 {
    public static void main(String[] args) {
        int n1;
        int n2 = 5;
        int nCasting = 0;

        n1 = ((5 + 5) * 2);
        n2 = n2 + n1;

        nCasting = (int) 10.555; //casting = conversao apenas do primeiro numero "4"

        System.out.println("Numero 1: " + n1);
        System.out.println("Numero 2: " + n2);
        System.out.println("Valor Casting: " + nCasting);


    }
}
