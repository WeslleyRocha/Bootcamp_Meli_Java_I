package PraticaIntegradora02;

import java.util.Scanner;

public class praticaIntegradora02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int circuloOpcao, nCelular, nEmergencia;
        int id = 0;
        int idade = 0;

        String rg, nome, sobrenome, gsanguineo;

        System.out.println("\n");
        System.out.println("   Bem vindo - Corrida na Selva!\n");
        System.out.println("Por favor, digite a opcao desejada:\n");

        System.out.println(" 1 - Circuito pequeno: 2 km pela selva e riachos.");
        System.out.println(" 2 - Circuito médio: 5 km pela selva, riachos e lama.");
        System.out.println(" 3 - Circuito Avançado: 10 km pela selva, riachos, lama e escalada.");
        System.out.println(" 0 - Para sair.");
        System.out.println("\n");
        circuloOpcao = ler.nextInt();

       if (circuloOpcao != 0 ){
           System.out.println("Ok, Agora preencha as informações para finalizar seu cadastro! ");
           System.out.println("\n");

           System.out.print("RG: ");
           rg = ler.next();

           System.out.print("Nome: ");
           nome = ler.next();

           System.out.print("Sobrenome: ");
           sobrenome = ler.next();

           System.out.print("Idade: ");
           idade = ler.nextInt();

           System.out.print("Número de celular, (Ex: 1199990000): ");
           nCelular = ler.nextInt();

           System.out.print("Número de Emergênciar,  (Ex: 1199990000): ");
           nEmergencia = ler.nextInt();

           System.out.print("Grupo Sanguíneo (Ex: O+ / A+) ");
           gsanguineo = ler.next();

           System.out.println("\n");
           System.out.println("Cadastro salvo com sucesso! ");
           System.out.println("\n");


           if (circuloOpcao == 1 ){
               if (idade >= 18){
                   System.out.println("Valor da inscrição para maiores de 18 anos R$: 1.500.");
               } else {
                   System.out.println("Valor da inscrição para menores de 18 anos R$: 1.300.");
               }
           }

           else if (circuloOpcao == 2){
               if (idade >= 18){
                   System.out.println("Valor da inscrição para maiores de 18 anos R$: 2.300.");
               } else {
                   System.out.println("Valor da inscrição para menores de 18 anos R$: 2.000.");
               }
           }

           else if (circuloOpcao == 3){
               if (idade >= 18){
                   System.out.println("Valor da inscrição para maiores de 18 anos R$: 2.800.");
               } else {
                   System.out.println("A inscrição não é permitida para menores de 18 anos.");
               }
           }
       } System.out.println("Obrigado ! - Corrida na Selva");
    }
}

