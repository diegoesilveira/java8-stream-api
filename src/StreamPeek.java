import java.util.ArrayList;
import java.util.List;

public class StreamPeek {
	
	public static void main(String[] args) {
		
		List<Jogador> jogador = new ArrayList<>();

		jogador.add(new Jogador("Diego Silveira", "Gremio", 50, "Atacante"));
		jogador.add(new Jogador("Silveira", "Gremio", 30, "lateral"));
		jogador.add(new Jogador("Joao", "Gremio", 10, "Zagueiro"));
		jogador.add(new Jogador("Victor", "Gremio", 80, "Atacante"));
		jogador.add(new Jogador("Pedro", "Internacional", 20, "Atacante"));
		jogador.add(new Jogador("Hugo Silveira", "Santos", 36, "Lateral"));
		jogador.add(new Jogador("Maicon", "São Paulo", 66, "Atacante"));
		jogador.add(new Jogador("Lucas", "Gremio", 50, "Atacante"));
		jogador.add(new Jogador("Emerson", "Internacional", 12, "Meio Campo"));
		jogador.add(new Jogador("Santos", "São Paulo", 50, "Atacante"));
		jogador.add(new Jogador("Di", "Gremio", 1, "Goleiro"));

		jogador.stream()
			.filter(j -> j.getTimeAtual().equalsIgnoreCase("Gremio"))
			.map(Jogador::getNome)
			.peek(System.out::println)
			.findAny();
	}

}
