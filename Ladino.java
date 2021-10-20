public class Ladino implements Aventureiro2{
  public String nome;
  public double vida, sanidade;
  public double dinheiro, energia;

  public Ladino(String nome, double vida, double sanidade, double energia, double dinheiro){
    this.nome = nome;
    this.vida = vida;
    this.sanidade = sanidade;
    this.energia = energia;
    this.dinheiro = dinheiro;
  }

  public double atacarInimigo(){
    System.out.println("De costas você não pode me ver chegando");
    return energia-=2;
  }

  public double defenderAtaque(){
    System.out.println("Tente olhar através da fumaça. Tente e falhe!");
    return energia-=3;
  }

  public double descansarAventureiro(){
    return vida+=10;
  }

  public double roubarInimigo(){
    System.out.println("Agora isso é meu!");
    return dinheiro +=5;
  }

}