package Exemplo04;

public class exemplo04 {
    public static void main(String[] args) {

        final int tamanho =5;

        int numero [] = new int[tamanho];

        for (int i = 0; i < tamanho; i++){

            numero[i] = i;
        }

        for (int i = 0; i < numero.length; i++){
            System.out.println(numero[i] + " ");
        }
        }
    }
