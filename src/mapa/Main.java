package mapa;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vertice> cidades = new ArrayList<>();
		ArrayList<Aresta> conexoes = new ArrayList<>();
		Grafo g1 = new Grafo(cidades, conexoes);
		menu(g1);

	}
	
	public static void menu(Grafo g1) {
		Scanner teclado = new Scanner (System.in);
		int input;
		input = 69;
			while(input!=0) {
				System.out.println("\nEscolha uma opção: \n 1 - Cadastrar Cidade. \n 2 - Cadastrar Conexão."
						+ "\n 3 - Listar Cidades. \n 4 - Listar Conexões. \n 5 - Procurar por cidades vizinhas."
						+ "\n 9 - Importar o Mapa da Região de Kanto. \n 0 - Encerrar atividades.");
				input = teclado.nextInt();
					if (input==1) {
						g1.adicionarCidade();
					}
					if (input==2) {
						g1.adicionarConexao();						
					}
					if (input==3) {
						System.out.println("Cidades cadastradas:");
						g1.checkVizinhos();
						g1.infoCidades();
					}
					if (input==4) {
						System.out.println("Conexões cadastradas:");
						g1.infoConexoes();
					}
					if (input==5) {
						
					}
					if(input==9) {
						g1.cadastroKanto();						
					}
			}
		
	}
}
