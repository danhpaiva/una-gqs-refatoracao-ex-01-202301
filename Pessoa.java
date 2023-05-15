import java.util.Scanner;

public class Pessoa {
  // public String nome;
  public int idade;
  public String cartaoVacinaEmDia;
  public String teveSintomasRecentemente;
  public String teveContatoComPessoasSintomaticas;
  public String estaRetornandoViagem;
  public int porcentagemInfeccao;
  public String orientacaoFinal;

  /*
   * public void coletaNome(Pessoa pessoa, Scanner scanner) {
   * System.out.println("\nInforme o seu nome: ");
   * pessoa.nome = scanner.nextLine();
   * }
   */

  public void coletaIdade(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nInforme a sua idade: ");
    pessoa.idade = scanner.nextInt();
  }
}
