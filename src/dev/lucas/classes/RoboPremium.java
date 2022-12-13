package dev.lucas.classes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RoboPremium extends RoboAritimetico {

	private TipoResposta tipoResposta = TipoResposta.IS_A_PREMIUM;

	@Override
	public String responda() {

		if (tipoResposta.tipoResposta() == TipoResposta.IS_A_PREMIUM.tipoResposta()) {
			JFrame jf = new JFrame();
			jf.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(jf, "Ola amigo! Obrigado por conversar comigo");
			return "Ola amigo! Obrigado por conversar comigo";
		}

		return super.responda();
	}

	@Override
	public TipoResposta analizaTipoPergunta(String pergunta) {

		if (pergunta.toLowerCase().contains("agir")) {
			tipoResposta = TipoResposta.IS_A_PREMIUM;
		} else {
			tipoResposta = super.analizaTipoPergunta(pergunta);
		}

		return tipoResposta;
	}
}
