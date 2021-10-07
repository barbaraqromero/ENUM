package br.com.zup;

public class Consumidor {
  private String nome;
  private String email;
  private TipoDeCadastro tipoDeCadastro;

  public Consumidor() {

  }

  public Consumidor(String nome, String email, TipoDeCadastro tipoDeCadastro) {
    this.nome = nome;
    this.email = email;
    this.tipoDeCadastro = tipoDeCadastro;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TipoDeCadastro getTipoDeCadastro() {
    return tipoDeCadastro;
  }

  public void setTipoDeCadastro(TipoDeCadastro tipoDeCadastro) {
    this.tipoDeCadastro = tipoDeCadastro;
  }

  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append("\nNome: " + nome);
    mostrarDados.append("\nE-mail: " + email);
    mostrarDados.append("\nTipo de Cadastro: " + tipoDeCadastro);
    return mostrarDados.toString();
  }
}
