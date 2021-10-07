package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class FaturaService {
  private static List<Fatura> faturaList = new ArrayList<>();

  public static Fatura cadastrarFatura(String email, double valor, String dataDeVencimento) throws Exception {
    Consumidor consumidor = ConsumidorService.verificarEmailExistente(email);
    Fatura fatura = new Fatura(consumidor, valor, dataDeVencimento);
    faturaList.add(fatura);
    return fatura;
  }
}
