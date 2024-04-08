package excecoes;

import pessoa.Pessoa;

public class Excecoes {
    
//Checked exceptions - com tratamento

//Unchecked exceptions - sem tratamento
public static void main(String[] args) {
   //try / catch
   /*try{
    validarNumero();
   }catch(Exception e){
    System.out.println("Deu ruim");
    //mostrar o erro detalhado
    e.printStackTrace();
   }*/

   Pessoa p = null;
   p.getCpf();
}

/*static - instanciar sem acessar a classe */
public static void validarNumero() throws Exception{

    int numero = 10;
    if(numero < 100){
        throw new Exception("o numero pe menor que 100");
    }

   }


}
