package mapa;
import java.util.ArrayList;

public class Vertice {
	String nome, nomeLowerCase;
	String nomeVizinho;
	ArrayList<Vertice> vizinhanca = new ArrayList<>();
	ArrayList<Aresta> conexoes = new ArrayList<>();
		
		Vertice(String nome){
			this.nome = nome;
			this.nomeLowerCase = nome.toLowerCase();
		}
		
		
		void info() {
			System.out.println("- " + nome + ". Vizinhos: ");
				for (int i=0; i<vizinhanca.size(); i++) {
					System.out.println(vizinhanca.get(i).nome + " / ");
				}
		}
		
		void addVizinho(String nomeVizinho) {
			vizinhanca.add(new Vertice(nomeVizinho));
		}
		
}
