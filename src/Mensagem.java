import java.io.Serializable;
import java.util.Random;

public class Mensagem implements Serializable {
	private static final long serialVersionUID = 1L;

	String[] myStrings = { "Gostaria de enfatizar que o comprometimento entre as equipes cumpre um papel essencial na formulação", "a consulta aos diversos militantes promove a alavancagem dos métodos utilizados na avaliação de resultados", "Pensando mais a longo prazo, o entendimento das metas propostas agrega valor ao estabelecimento das condições inegavelmente apropriadas" };

	public String getMensagem() {
		int rnd = new Random().nextInt(myStrings.length);
		return myStrings[rnd];
	}
}
