package Atividade_Extra01;

import java.util.Scanner;

public class AppCliente {

    public static void main(String[] args) {

       Cliente cliente1 = new Cliente();
       Cliente cliente2 = new Cliente();

        cliente1.nome="Nome do Cliente1 em ClasseAppCleinte";
        cliente1.sobrenome = "Sobrenome Cliente1";
        cliente1.idade = 10;

        cliente2.nome = "Nome 2";
        cliente2.sobrenome = "Sobrenome";
        cliente2.idade = 12;

        String print = cliente1.print();
        {
        }

        String print2 = cliente2.print();
        {
        }

       // System.out.println(cliente1.nome);
       // System.out.println(cliente1.sobrenome);
       // System.out.println(cliente1.idade);


    }
}
