package br.com.zup;

public class Main {

    public static void main(String[] args) {
      try {
        Consumidor consumidor = Sistema.cadastrarConsumidor();
        System.out.println(consumidor);

      }
      catch (Exception erro){
        System.out.println(erro.getMessage());

      }




    }
}
