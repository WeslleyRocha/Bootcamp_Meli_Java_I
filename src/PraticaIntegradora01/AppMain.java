package PraticaIntegradora01;

public class AppMain {

    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa();

        Pessoa pessoa1 = new Pessoa("Weslley", 10, "007");

        Pessoa pessoa2 = new Pessoa("Weslley 2 ", 20, "007 - 2",82.00,2.90);

        pessoa.calcularIMC();

        System.out.println(pessoa.toString());

        System.out.println(pessoa1.toString());

        System.out.println(pessoa2.toString() +", "+ pessoa2.calcularIMC());
    }
}

