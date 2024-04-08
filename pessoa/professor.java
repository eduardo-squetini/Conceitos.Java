package pessoa;

public class professor extends Pessoa {
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Polimorfismo
    String imprimirDados(){
        System.out.println(super.imprimirDados());
        return "Você é um professor";
    }

}
