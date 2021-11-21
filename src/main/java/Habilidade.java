public class Habilidade {
  private boolean status;
  private String nomeH, descricao;

  public Habilidade(String nomeH, boolean status, String descricao) {
    this.nomeH = nomeH;
    this.descricao = descricao;
    this.status = status;
  }

  Habilidade Thriller = new Habilidade("Thriller", true, "Cura seu personagem em 10%");
  Habilidade Bulacha = new Habilidade("Bulacha", true, "Retira do adverário 10% de vida");
  Habilidade Boomerang = new Habilidade("Boomerang", true, "Retira 30% do inimigo mas perde 15%");
  Habilidade Elefante = new Habilidade("Elefante", true, "5");
  Habilidade Chocolate = new Habilidade("Chocolate", true, "4");

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public Habilidade getThriller() {
    return Thriller;
  }

  public void setThriller(Habilidade thriller) {
    Thriller = thriller;
  }

  public Habilidade getBulacha() {
    return Bulacha;
  }

  public void setBulacha(Habilidade bulacha) {
    Bulacha = bulacha;
  }

  public Habilidade getBoomerang() {
    return Boomerang;
  }

  public void setBoomerang(Habilidade boomerang) {
    Boomerang = boomerang;
  }

  public Habilidade getElefante() {
    return Elefante;
  }

  public void setElefante(Habilidade elefante) {
    Elefante = elefante;
  }

  public Habilidade getChocolate() {
    return Chocolate;
  }

  public void setChocolate(Habilidade chocolate) {
    Chocolate = chocolate;
  }

  public String getNomeH() {
    return nomeH;
  }

  public void setNomeH(String nomeH) {
    this.nomeH = nomeH;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}