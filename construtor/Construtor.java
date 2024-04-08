package construtor;

public class Construtor {
//possui o nome da classe, void, com ou sem parâmetros  
  
  private int numero;

  public Construtor (int numero, String texto){
    this.numero = numero;
    System.out.println("Construtor com parametro criado");
  } 
  
  public int getNumero() {
      return numero;
  }

  public void setNumero(int numero) {
      this.numero = numero;
  }
}

