package br.com.zup;


import java.util.List;
import java.util.Scanner;

public class Sistema {

  private static Scanner capturarDados(String mensagem) {
    System.out.println(mensagem);
    return new Scanner(System.in);
  }

  public static void exibicaoMenu() {
    System.out.println("\n---- M E N U ----");
    System.out.println("1 - Cadastrar consumidor");
    System.out.println("2 - Cadastrar fatura");
    System.out.println("3 - Consultar faturas");
  }

  public static Consumidor cadastrarConsumidor() throws Exception {
    String nome = capturarDados("Digite o nome: ").nextLine();
    String email = capturarDados("Digite o email: ").nextLine();
    System.out.println("---- TIPOS DE CADASTRO ----");
    System.out.println(ConsumidorService.mostrarTiposDeCadastro());
    String tipoDeCadastro = capturarDados("\nDigite o tipo de cadastro: ").nextLine();
    return ConsumidorService.cadastrarConsumidor(nome, email, tipoDeCadastro);
  }

  public static Fatura cadastrarFatura() throws Exception {
    String email = capturarDados("Digite o email do consumidor: ").nextLine();
    double valor = capturarDados("Digite o valor da fatura (em R$): ").nextDouble();
    String dataDeVencimento = capturarDados("Digite a data de vencimento: ").nextLine();

    return FaturaService.cadastrarFatura(email, valor, dataDeVencimento);
  }

  public static List<Fatura> mostrarFaturas () throws Exception {
    String email = capturarDados("Digite o email para consulta: ").nextLine();
    ConsumidorService.validarEmail(email);
    List<Fatura> faturas = FaturaService.pesquisarFaturaPorEmail(email);
    return faturas;
  }

  public static void executar() throws Exception {
    boolean continuar = true;

    while (continuar) {
      exibicaoMenu();
      int opcaoDesejada = capturarDados("\nDigite a opção desejada: ").nextInt();

      if (opcaoDesejada == 1) {
        Consumidor consumidor = cadastrarConsumidor();
        System.out.println(consumidor);
      } else if (opcaoDesejada == 2) {
        Fatura fatura = cadastrarFatura();
        System.out.println(fatura);
      } else if (opcaoDesejada == 3){
        List<Fatura> faturas = mostrarFaturas();
        System.out.println(faturas);
      }
    }
  }
}

