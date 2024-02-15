package exjv2;

class Pais{
	String nome;
	int populacao;
	int area;
	Pais(String nome, int populacao, int area){
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}
	int getPopulacao() {
		return this.populacao;
	}
	@Override
	public String toString() {
		return nome + "," + populacao + "," + area;
	}
}


public class q21 {

	public static void main(String [] args) {
		Pais [] paises = {
				new Pais("Condado",1000,5000),
				new Pais("Mordor",2500,10000),
				new Pais("Eriador",4000,20000)
		};
		int soma = 0;
		int n = paises.length;
		for (int i = 0; i < n; i++) {
			soma += paises[i].getPopulacao();
		}
		System.out.print(soma);
	}
}

