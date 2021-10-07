package br.com.zup;


import java.util.Scanner;

public class Sistema {

  private static Scanner capturarDados (String mensagem){
    System.out.println(mensagem);
    return new Scanner(System.in);
  }

  private static void menu (){
    System.out.println("---- M E N U ----");
    System.out.println("\n1 - Cadastrar consumidor");
    System.out.println("\n2 - Cadastrar fatura");
    System.out.println("3 - Sair do programa");
  }
}
