package PraticaIntegradora02.Exercicio2;

public class Distribuidora {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[7];
        produtos[0] = new Pereciveis("Pera", 2.99, 1);
        produtos[1] = new Pereciveis("Morango", 4.99, 2);
        produtos[2] = new Pereciveis("Abacaxi", 3.99, 10);
        produtos[3] = new Pereciveis("Banana", 4.50, 1);
        produtos[4] = new NaoPereciveis("Salgadinho", 7.99);
        produtos[5] = new NaoPereciveis("Açucar", 3.80);
        produtos[6] = new NaoPereciveis("Chocolate", 5.99);

        double valorTotal = 0;

        int i;
        for (i = 0; i < produtos.length; i++) {
           valorTotal = produtos[i].calcular(7);
           System.out.println(produtos[i].getNome() + valorTotal);
        }

    }
}