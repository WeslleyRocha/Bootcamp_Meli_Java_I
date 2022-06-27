package PraticaIntegradora01;

public class Pessoa {

    String nome, iD ;
    int idade ;

    boolean ehMaiorIdade;

    double altura, peso;

    public Pessoa(){ //Modelo Parametro

    }

    public  Pessoa (String nome, int idade, String iD){
            this.nome = nome;
            this.idade = idade;
            this.iD = iD;
    }

    public Pessoa (String nome, int idade, String iD, double peso, double altura){
            this.nome = nome;
            this.idade = idade;
            this.iD = iD;
            this.peso = peso;
            this.altura = altura;
    }

    public String calcularIMC (){
        double calculo = peso/Math.pow(altura,2);

        if (calculo < 20){
            return "Vocé está abaixo do peso";
        } else if (calculo >= 20 && calculo<= 25 ){
            return  "Vocé está com o peso Saudável";
        }
            return "Vocé está com Sobrepeso";
    }

    public boolean ehMaiorIdade(){
        if ( idade > 18){
            return true;
        } else {
            return false;
        }
        }

    @Override
    public String toString() {

        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", iD='" + iD + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
