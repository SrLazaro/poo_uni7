class Carro{

String cor;
String marca;
String modelo;
float tanque;
int ano;

void andar(float distancia){

float gasolina_gasta;

// 1L = 12KM

gasolina_gasta = distancia / 12;

if(tanque >= gasolina_gasta){

System.out.println("O carro andou " + distancia + " Km");

tanque = tanque - gasolina_gasta;

}else{

  System.out.println("Precisa colocar mais gasolina para andar essa distância!");

}

}

void abastecer(int litros){

  System.out.println("Carro abastecido!");

  tanque = tanque + litros;

}

}