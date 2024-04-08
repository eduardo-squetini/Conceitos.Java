package pessoa;

public class aluno extends Pessoa{
 
    private String matrícula;

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }
    

 //Polimorfismo
 String imprimirDados(){
    System.out.println(super.imprimirDados());
    return "Você é um aluno";
}

}
