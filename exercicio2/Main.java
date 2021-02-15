class Main {
  public static void main(String[] args) {

    Carro c1 = new Carro();
    c1.marca = "Chevrolet";
    c1.modelo = "Celta";
    c1.tanque = 1;
    c1.cor = "Preto";
    c1.ano = 2015;

    c1.andar(24);
    c1.abastecer(2);
    c1.andar(24);
  }
}