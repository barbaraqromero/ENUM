package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Barbara", "barbara@barbara");
        Fatura fatura = new Fatura(consumidor, 800, "31/05/2000");

        ConsumidorService.cadastrarConsumidor("Barbara", "barbara@barbara");
        System.out.println(consumidor);

        FaturaService.cadastrarFatura("barbara@barbara", 800, "23/05/2000");
        System.out.println(fatura);

    }
}
