/* Alunos: André Luíz Ribeiro de Araújo Lima, Davi Santos Rodrigues
Nessa atividade nós decidimos criar classes baseadas em jogos de rpg (RolePlay Game)*/
class Main {
  public static void main(String[] args) {
    Mago x = new Mago("Harry Potter",10,10);//a partir de classe abstrata
    Guerreiro y = new Guerreiro("Kléber",15,10);//a partir de classe abstrata
    Clerigo a = new Clerigo("Seu José",7,10,10);//a partir de interface
    Ladino b = new Ladino("Zeca",13,10,15,45);//a partir de interface
    
    x.mana = 55;
    y.energia = 50;

    System.out.println("");

//Testando os atributos do mago
    System.out.println("Nome:"+x.nome);
    System.out.println("Vida:"+x.vida);
    System.out.println("Sanidade:"+x.sanidade);
    System.out.println("Mana:"+x.mana);

    System.out.println("");

    x.atacarInimigo();
    x.defenderAtaque();
    x.descansarAventureiro();

    System.out.println("");

//Testando os atributos do mago após a execução dos métodos
    System.out.println("Nome:"+x.nome);
    System.out.println("Vida:"+x.vida);
    System.out.println("Sanidade:"+x.sanidade);
    System.out.println("Mana:"+x.mana);

    System.out.println("");
    System.out.println("");

//Testando os atributos do guerreiro
    System.out.println("Nome:"+y.nome);
    System.out.println("Vida:"+y.vida);
    System.out.println("Sanidade:"+y.sanidade);
    System.out.println("Energia:"+y.energia);

    System.out.println("");

    y.atacarInimigo();
    y.defenderAtaque();
    y.descansarAventureiro();

    System.out.println("");

//Testando os atributos do guerreiro após a execução dos métodos    
    System.out.println("Nome:"+y.nome);
    System.out.println("Vida:"+y.vida);
    System.out.println("Sanidade:"+y.sanidade);
    System.out.println("Energia:"+y.energia);

    System.out.println("");
    System.out.println("");

//Testando os atributos do clérigo
    System.out.println("Nome:"+a.nome);
    System.out.println("Vida:"+a.vida);
    System.out.println("Sanidade:"+a.sanidade);
    System.out.println("Adoração:"+a.adoracao);

    System.out.println("");

    a.atacarInimigo();
    a.defenderAtaque();
    a.descansarAventureiro();
    a.curarCompanheiro();

    System.out.println("");

//Testando os atributos do clérigo após a execução dos métodos
    System.out.println("Nome:"+a.nome);
    System.out.println("Vida:"+a.vida);
    System.out.println("Sanidade:"+a.sanidade);
    System.out.println("Adoração:"+a.adoracao);

    System.out.println("");
    System.out.println("");

//Testando os atributos do ladino
    System.out.println("Nome:"+b.nome);
    System.out.println("Vida:"+b.vida);
    System.out.println("Sanidade:"+b.sanidade);
    System.out.println("Energia:"+b.energia);
    System.out.println("Dinheiro:"+b.dinheiro);

    System.out.println("");

    b.atacarInimigo();
    b.defenderAtaque();
    b.descansarAventureiro();
    b.roubarInimigo();

    System.out.println("");

//Testando os atributos do ladino após a execução dos métodos
    System.out.println("Nome:"+b.nome);
    System.out.println("Vida:"+b.vida);
    System.out.println("Sanidade:"+b.sanidade);
    System.out.println("Energia:"+b.energia);
    System.out.println("Dinheiro:"+b.dinheiro);
  }
}