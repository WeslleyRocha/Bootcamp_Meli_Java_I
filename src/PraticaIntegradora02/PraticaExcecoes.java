package PraticaIntegradora02;

public class PraticaExcecoes {
    public static void main(String[] args) {

    int a = 0;
    int b = 300;

   try {
       int  calculo = b/a;
   } catch (java.lang.ArithmeticException e){
       System.out.println("“Ocorreu um erro”");
   } finally {
       System.out.println("“Programa finalizado”.");
   }
    }
}
