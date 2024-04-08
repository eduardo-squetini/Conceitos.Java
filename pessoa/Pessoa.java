package pessoa;

public class Pessoa {
    // nome, idade, cpf
    // tipo nomeVariavel

    private String nome;
    private int idade;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String imprimirDados() {
        return "O nome da pessoa é " + "a idade é "
                + idade + " e o cpf é " + cpf;
    }
}
