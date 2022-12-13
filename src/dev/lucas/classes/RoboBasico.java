package dev.lucas.classes;

public class RoboBasico implements Robo {
	private TipoResposta tipoResposta = TipoResposta.IS_NO_ONE;

	@Override
	public String responda() {

		return tipoResposta.resposta();
	}

	@Override
	public TipoResposta analizaTipoPergunta(String pergunta) {

		if (Utils.isAQuestion(pergunta) && Utils.isAScream(pergunta)) {
			tipoResposta = TipoResposta.IS_A_SCREAM_AND_A_QUESTION;
		} else if (Utils.isAQuestion(pergunta)) {
			tipoResposta = TipoResposta.IS_A_QUESTION;
		} else if (Utils.isAScream(pergunta)) {
			tipoResposta = TipoResposta.IS_A_SCREAM;
		}

		return tipoResposta;
	}
}
