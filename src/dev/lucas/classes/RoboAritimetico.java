package dev.lucas.classes;

public class RoboAritimetico extends RoboBasico {

	private String resposta = "";

	@Override
	public String responda() {
		// TODO Auto-generated method stub
		return this.resposta.isEmpty() ? super.responda() : this.resposta;
	}

	@Override
	public TipoResposta analizaTipoPergunta(String pergunta) {
		float a;
		float b;

		this.resposta = "";


		if (Utils.isAMathOperation(pergunta.toLowerCase())) {

			String str = pergunta.replaceAll("[^\\d.]", " ").trim().replaceAll(" +", " ").trim();
			String[] numbers = str.split(" ");

			if (numbers.length != 2) {
				this.resposta = "Voce precisa de dois numeros reais para fazera operacao :p";
			} else {
				a = Float.parseFloat(numbers[0]);
				b = Float.parseFloat(numbers[1]);

				if (pergunta.toLowerCase().contains("some") || pergunta.toLowerCase().contains("soma")) {
					this.resposta = "Essa eu sei!! O resultado é " + this.soma(a, b);
				} else if (pergunta.toLowerCase().contains("multiplica") || pergunta.toLowerCase().contains("multiplique")) {
					this.resposta = "Essa eu sei!! O resultado é " + this.multiplica(a, b);
				} else if (pergunta.toLowerCase().contains("divide") || pergunta.toLowerCase().contains("divida")) {
					if (b == 0) {
						this.resposta = "Hmm... voce nao pode dividir um numero por 0 :p";
					} else {
						this.resposta = "Essa eu sei!! O resultado é " + this.divide(a, b);
					}
				} else if (pergunta.toLowerCase().contains("subtraia") || pergunta.toLowerCase().contains("subtraie")) {
					this.resposta = "Essa eu sei!! O resultado é " + this.subtrai(a, b);
				}

			}

			return TipoResposta.IS_A_MATH;
		}

		return super.analizaTipoPergunta(pergunta);
	}

	private float soma(float a, float b) {
		return a + b;
	}

	private float subtrai(float a, float b) {
		return a - b;
	}

	private float multiplica(float a, float b) {
		return a * b;
	}

	private float divide(float a, float b) {
		return a / b;
	}
}
