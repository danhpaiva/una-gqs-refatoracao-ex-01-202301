import java.util.Scanner;

public class Mensagem {

  public boolean realizaPerguntaVacinaEmDia(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out.println("\nSeu cartão de vacina está em dia? Digite SIM ou NAO ?");
      pessoa.cartaoVacinaEmDia = scanner.next().toUpperCase();
      if (pessoa.cartaoVacinaEmDia.equals("SIM") || pessoa.cartaoVacinaEmDia.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaTeveSintomasRecenmente(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out
          .println("\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)" +
              "Digite SIM ou NAO");
      pessoa.teveSintomasRecentemente = scanner.next().toUpperCase();
      if (pessoa.teveSintomasRecentemente.equals("SIM") || pessoa.teveSintomasRecentemente.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaTeveContatoPessoasAssintomaticas(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out
          .println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?" +
              "Digite SIM ou NAO");
      pessoa.teveContatoComPessoasSintomaticas = scanner.next().toUpperCase();
      if (pessoa.teveContatoComPessoasSintomaticas.equals("SIM")
          || pessoa.teveContatoComPessoasSintomaticas.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaEstaRetornandoViagemExterior(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out
          .println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?" +
              "Digite SIM ou NAO");
      pessoa.estaRetornandoViagem = scanner.next().toUpperCase();
      if (pessoa.estaRetornandoViagem.equals("SIM")
          || pessoa.estaRetornandoViagem.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public void imprimirRelatorioFinal(Pessoa pessoa) {
    System.out.println("\nNome: " + pessoa.nome);
    System.out.println("Idade: " + pessoa.idade + " anos");
    System.out.println("Cartão Vacinal em Dia: " + pessoa.cartaoVacinaEmDia);
    System.out.println("Teve sintomas recentemente: " + pessoa.teveSintomasRecentemente);
    System.out.println("Teve contato com pessoas infectadas: " + pessoa.teveContatoComPessoasSintomaticas);
    System.out.println("Esta retornando de viagem: " + pessoa.estaRetornandoViagem);
    System.out.println("Porcentagem infecção: " + pessoa.porcentagemInfeccao);
    System.out.println("Orientação Final: " + pessoa.orientacaoFinal);
  }

  public void imprimirMensagemErro() {
    System.out.println("Não foi possível realizar o ZZZZZZZZZZ." +
        "Gentileza ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ.");
  }
}