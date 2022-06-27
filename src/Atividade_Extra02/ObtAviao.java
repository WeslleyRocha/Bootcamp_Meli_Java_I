package Atividade_Extra02;

import java.util.Scanner;

public class ObtAviao {
    public static void main(String[] args) {

        Aviao aviao = new Aviao();
        Aviao aviao1 = new Aviao();

        Scanner ler = new Scanner(System.in);

        aviao.companhia = "GOL";
        aviao.npassageiros = 44;

        aviao1.companhia = "Azul";
        aviao1.npassageiros = 50;

        System.out.println("Companhia: " + aviao.companhia
                + ", Passageiros: " + aviao.npassageiros);

        System.out.println("Companhia: " + aviao1.companhia
                 + ", Passageiros: " + aviao1.npassageiros);

    }
}
