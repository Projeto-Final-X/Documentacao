
public class Personagem {
  private boolean status;
  private String nome;
  private int TempoVida;
  private Habilidade habilidade;

  public Personagem(int TempoVida, boolean status, String nome, Habilidade habilidade) {
    this.nome = nome;
    this.habilidade = habilidade;
    this.TempoVida = TempoVida;
    this.status = status;
  }

  Habilidade th;

  Personagem MJackson = new Personagem(5, true, "MJackson", Thriller);

  public Personagem(String nome) {
    this.nome = nome;
  }

  public int getTempoVida() {
    return TempoVida;
  }

  public void setTempoVida(int TempoVida) {
    this.TempoVida = TempoVida;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getHabilidade() {
    return habilidade;
  }

  public void setHabilidade(String habilidade) {
    this.habilidade = habilidade;
  }

}