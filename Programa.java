import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean erroTentativas = false;
    Pessoa pessoa = new Pessoa();
    Mensagem mensagem = new Mensagem();
    Validacao validacao = new Validacao();

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");

    pessoa.coletaNome(scanner);
    pessoa.coletaIdade(pessoa, scanner);

    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa);

    validacao.validacaoDasProximasPerguntas(pessoa);

    validacao.calcularValidacaoFinal(erroTentativas);

    // scanner.close();
  }
}