package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ConsumidorService {
  private static List<Consumidor> consumidorList = new ArrayList<>();

  public static void validarEmail(String email) throws Exception {
    if (!email.contains("@")) {
      throw new Exception("Email inválido!");
    }

  }

  public static void verificarEmailExistente(String email) throws Exception {
    for (Consumidor referencia : consumidorList) {
      if (referencia.getEmail().equals(email)) {
        throw new Exception("Email já cadastrado!");
      }
    }

  }

  public static Consumidor cadastrarConsumidor(String nome, String email, String tipoRecebido) throws Exception {
    validarEmail(email);
    verificarEmailExistente(email);
    TipoDeCadastro tipoDeCadastro1 = validarTipoDeCadastro(tipoRecebido);
    Consumidor consumidor = new Consumidor(nome, email, tipoDeCadastro1);
    consumidorList.add(consumidor);
    return consumidor;
  }

  public static List<TipoDeCadastro> mostrarTiposDeCadastro() {
    List<TipoDeCadastro> tipoDeCadastros = new ArrayList<>();
    for (TipoDeCadastro referencia : TipoDeCadastro.values()) {
      tipoDeCadastros.add(referencia);

    }
    return tipoDeCadastros;

  }

  public static TipoDeCadastro validarTipoDeCadastro(String tipoDeCadastro) throws Exception {
    for (TipoDeCadastro referencia : TipoDeCadastro.values()) {
      if (tipoDeCadastro.equalsIgnoreCase(String.valueOf(referencia))) {
        return referencia;

      }

    }
    throw new Exception("Tipo de cadastro não existente!");
  }
}



