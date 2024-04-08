package conta;

public class TesteConta {

public static void main(String[] args) {
    
    ContaBancaria conta1 = new ContaBancaria();
    conta1.setNumero("4565");
    conta1.setTitular("Jose");
   

    conta1.depositar(50);
    conta1.sacar(100);


}


}
