package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class FaturaService {
  private static List<Fatura> faturaList = new ArrayList<>();

  public static Fatura cadastrarFatura(String email, double valor, String dataDeVencimento) throws Exception {
    Consumidor consumidor = ConsumidorService.pesquisarConsumidor(email);
    Fatura fatura = new Fatura(consumidor, valor, dataDeVencimento);
    faturaList.add(fatura);
    return fatura;
  }

  public static List<Fatura> pesquisarFaturaPorEmail(String email) {
    List<Fatura> faturasDoConsumidor = new ArrayList<>();
    for (Fatura referencia : faturaList) {
      if (referencia.getConsumidor().getEmail().equals(email)) {
        faturasDoConsumidor.add(referencia);
      }
    }
    return faturasDoConsumidor;
  }
}
