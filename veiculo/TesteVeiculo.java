package veiculo;

public class TesteVeiculo {
    
public static void main(String[] args) {
    veiculo veiculo1 = new carro();
    veiculo veiculo2 = new moto();

    veiculo1.acelerar();
    veiculo1.frear();

    veiculo2.acelerar();
    veiculo2.frear();

    
}

}
