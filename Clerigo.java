public class Clerigo implements Aventureiro2{
  public String nome;
  public double vida, sanidade;
  public double adoracao;

  public Clerigo(String nome, double vida, double sanidade, double adoracao){
    this.nome = nome;
    this.vida = vida;
    this.sanidade = sanidade;
    this.adoracao = adoracao;
  }

  public double atacarInimigo(){
    System.out.println("Queime com a chama divina!");
    return adoracao-=1;
  }

  public double defenderAtaque(){
    System.out.println("A invencibilidade está na defesa");
    return adoracao-=1;
  }

  public double descansarAventureiro(){
    return vida+=10;
  }

  public double curarCompanheiro(){
    System.out.println("Amém, irmão");
    return adoracao -=2;
  }

}