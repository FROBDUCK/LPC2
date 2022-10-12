package produto;

public class produtoteste {
public static void main(String[] args) {
	produto Produto;
	Produto = new produto();
	
	Produto.marca = "coca cola";
	Produto.sabor = "zero";
	Produto.litro = 3f;
	
	produto Produto2;
	Produto2 = new produto();
	
	Produto2.marca = "fanta";
	Produto2.sabor = "laranja";
	Produto2.litro = 2f;
	
	System.out.println("marca: " + Produto.marca + "sabor: "+ Produto.sabor + "litros: "+ Produto.litro);
	System.out.println("marca: " + Produto2.marca + "sabor: "+ Produto2.sabor + "litros: "+ Produto2.litro);
}
}
