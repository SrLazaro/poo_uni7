
class Main{

  public static void main(String args[]){

    // javac *.java && java Main

    // Instanciando cachorros
    Cachorro c1 = new Cachorro();
    Cachorro c2 = new Cachorro();

    // Atribuindo atributos
    c1.nome = "Fofo";
    c1.idade = 5;

    c2.nome = "Bily";
    c2.idade = 4;

    // Latindo
    c1.latir();

  }

}