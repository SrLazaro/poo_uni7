

class Cachorro{
  
  String nome;
  String raca;
  int comrpimentoDoPelo;
  int idade;
  float peso;

void latir(){
  System.out.println(nome + ":Au, au, au!");
}

void andar(int distancia){
  System.out.println("O Cachorro " + nome + "andou " + distancia + "KM.");
}

}