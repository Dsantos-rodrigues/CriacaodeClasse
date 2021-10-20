public class Mago extends Aventureiro{
  public double mana;

  public Mago(String nome, double vida, double sanidade){
    super(nome, vida, sanidade);
  }

  public double atacarInimigo()
  {
    System.out.println("Bola de Fogo!!");
    return mana-=5;
  }

  public double defenderAtaque()
  {
    System.out.println("Escudo Mágico!!!");
    return mana-=3;
  }
}