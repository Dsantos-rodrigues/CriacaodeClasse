public class Guerreiro extends Aventureiro{
  public double energia;

  public Guerreiro(String nome, double vida, double sanidade){
    super(nome, vida, sanidade);
  }

  public double atacarInimigo()
  {
    System.out.println("Tome isso!! Aaaaaargh!!!");
    return energia-=7;
  }

  public double defenderAtaque()
  {
    System.out.println("Haha, não vai passar do meu escudo!!!");
    return energia-=3;
  }
}