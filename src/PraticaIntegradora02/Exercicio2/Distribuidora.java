package PraticaIntegradora02.Exercicio2;

public class Distribuidora {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[7];
        produtos[0] = new Pereciveis("Pera - R$: ", 2.99, 1);
        produtos[1] = new Pereciveis("Morango - R$: ", 4.99, 2);
        produtos[2] = new Pereciveis("Abacaxi - R$: ", 3.99, 10);
        produtos[3] = new Pereciveis("Banana - R$: ", 4.50, 1);
        produtos[4] = new NaoPereciveis("Salgadinho - R$: ", 7.99);
        produtos[5] = new NaoPereciveis("Açucar - R$: ", 3.80);
        produtos[6] = new NaoPereciveis("Chocolate - R$: ", 5.99);

        double valorTotal = 0;

        for (int i = 0; i < produtos.length; i++) {
           valorTotal += produtos[i].calcular(1);
           System.out.println(produtos[i].getNome() + valorTotal);
        }

    }
}