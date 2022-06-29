package PraticaIntegradora02.Exercicio2;

public class Produto {

    String nome;
    int preco;

    public Produto(String nome, Double preco){

    }

    public double calcular(int qtdProdutos){
        return preco * qtdProdutos;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = (int) preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
