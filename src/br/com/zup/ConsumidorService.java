package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ConsumidorService {
  private static List<Consumidor> consumidorList = new ArrayList<>();

  public static Consumidor cadastrarConsumidor (String nome, String email){
    Consumidor consumidor = new Consumidor(nome, email);
    consumidorList.add(consumidor);
    return consumidor;

  }
}
