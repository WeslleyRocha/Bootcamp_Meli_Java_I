package PraticaIntegradora02.Exercicio2;

public class NaoPereciveis extends Produto{
    String tipo;

    public NaoPereciveis(String nome, Double preco) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public double calcular(int qtdProdutos) {
        return super.calcular(qtdProdutos);
    }
}
