public abstract class Aventureiro{
  public String nome;
  public double vida, sanidade;

  public Aventureiro(String nome, double vida, double sanidade){
    this.nome = nome;
    this.vida = vida;
    this.sanidade = sanidade;
  }

  public abstract double atacarInimigo();
  public abstract double defenderAtaque();
  public double descansarAventureiro(){
    return this.vida+=10;
  }
}
