package Conceitos;

/**
 * PrimeiraClasse - nome da classe
 * public - tipo de acesso
 * class - tipo da classe
 * 
 */

public class Fundamentos {

    public static void main(String[] args) {
        /**
         * Valores (int, double float, long)
         * int - inteiro (10)
         * double - decimal (3.14)
         * float - decimal simples (3.14f)
         * long - quantidade maior de int (12335456456)
         * Texto (String) - "escrever texto"
         * Booleano (boolean) - true or false
         */

        int inteiro = 10;
        float dadoFloat = 3.14f;
        long dadoLongo = 15648468486545L;
        String dadoString = "Meu texto";
        boolean dadoBoolean = true;
        double dadoDouble = 3.14;

        // if - else
        /*
         * if (inteiro == 10) {
         * System.out.println("Entrou no if");
         * } else if(inteiro == 12){
         * System.out.println("Entrou no if do 12");
         * }
         * else{
         * System.out.println("Entrou no else");
         * }
         */

        // WHILE - Looping enquanto a condição for verdadeira
        /*
         * int valorInicial = 0;
         * while(valorInicial < 3){
         * System.out.println("O valor inicial é menor que 3");
         * System.out.println(valorInicial);
         * valorInicial++;
         * }
         * System.out.println("saiu do while");
         */

        // FOR
        /*
         * System.out.println("inicio FOR");
         * for(int i = 0; i< 4; i++){
         * System.out.println("O valor do i é: " + i);
         * }
         * System.out.println("fim do FOR");
         */
    }

}