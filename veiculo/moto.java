package veiculo;

public class moto implements veiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
        
    }

    @Override
    public void frear() {
        System.out.println("Freando a moto");
        
    }
    
}
