package pessoa;

public class TestedePessoa {

    public static void main(String[] args) {

        professor professor1 = new professor();
        professor1.setCpf("52792756699");
        professor1.setNome("Eduardo");
        professor1.setIdade(36);
        professor1.setSalario(5.000);

        System.out.println(professor1.imprimirDados());

        aluno aluno1 = new aluno();
        aluno1.setCpf("1236547899");
        aluno1.setIdade(19);
        aluno1.setNome("gabriel");
        aluno1.setMatrícula("8989898");
        System.out.println(aluno1.imprimirDados());



        /*
        System.out.println(pessoa1.imprimirDados(1)); 

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "52796756665";
        pessoa2.nome = "Clara";
        pessoa2.idade = 55;

        System.out.println(pessoa2.imprimirDados(2)); 
       */
        

    }

}
