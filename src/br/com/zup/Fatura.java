package br.com.zup;


public class Fatura {
  Consumidor consumidor;
  private double valor;
  private String dataDeVencimento;


  public Fatura(Consumidor consumidor, double valor, String dataDeVencimento) {
    this.consumidor = consumidor;
    this.valor = valor;
    this.dataDeVencimento = dataDeVencimento;
  }

  public Consumidor getConsumidor() {
    return consumidor;
  }

  public void setConsumidor(Consumidor consumidor) {
    this.consumidor = consumidor;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getDataDeVencimento() {
    return dataDeVencimento;
  }

  public void setDataDeVencimento(String dataDeVencimento) {
    this.dataDeVencimento = dataDeVencimento;
  }

  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append("\nConsumidor: " + consumidor);
    mostrarDados.append("\nValor da fatura (em R$): " + valor);
    mostrarDados.append("\nData de vencimento: " + dataDeVencimento);

    return mostrarDados.toString();
  }
}
