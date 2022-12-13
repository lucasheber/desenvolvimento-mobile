package dev.lucas.classes;

public enum TipoResposta {

	IS_A_MATH(-1, "Ooops... nao consegui entender :("), 
	IS_A_PREMIUM(-2, "Digite agir para ver uma mensagem bonita!"), 
	IS_NO_ONE(0, "Tudo bem, como quiser..."), 
	IS_A_QUESTION(1, "Certamente."), 
	IS_A_SCREAM(2, "Opa! Calma ai!"),
	IS_A_SCREAM_AND_A_QUESTION(3, "Relaxa, eu sei o que estou fazendo!");

	private int opcao;
	private String resposta;

	TipoResposta(int opcao, String resposta) {
		this.opcao = opcao;
		this.resposta = resposta;
	}

	public int tipoResposta() {
		return this.opcao;
	}

	public String resposta() {
		return this.resposta;
	}
}
