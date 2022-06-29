package PraticaIntegradora02.Exercicio2;

public class Pereciveis extends Produto{

    int diasParaVencer;

    public Pereciveis(String nome, Double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int qtdProdutos){

        if (diasParaVencer  == 1) {
            return (preco* qtdProdutos) /4;
        }

        else if (diasParaVencer == 2) {
            return (preco * qtdProdutos) /3;
        }

        else if (diasParaVencer ==3) {
    } return (preco * qtdProdutos) /2;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
