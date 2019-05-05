
public class Jogador {

	private String nome;
	private String timeAtual;
	private int golsMarcados;
	private String posicao;

	public Jogador(String nome, String timeAtual, int golsMarcados, String posicao) {

		this.nome = nome;
		this.timeAtual = timeAtual;
		this.golsMarcados = golsMarcados;
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTimeAtual() {
		return timeAtual;
	}

	public void setTimeAtual(String timeAtual) {
		this.timeAtual = timeAtual;
	}

	public int getGolsMarcados() {
		return golsMarcados;
	}

	public void setGolsMarcados(int golsMarcados) {
		this.golsMarcados = golsMarcados;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", timeAtual=" + timeAtual + ", golsMarcados=" + golsMarcados + ", posicao="
				+ posicao + "]";
	}
	
	

}
