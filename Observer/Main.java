package Observer;

public class Main {
	 public static void main(String[] args) {
	 // 1. Crie o Subject (a estação meteorológica)
	 EstacaoMeteorologica estacao = new EstacaoMeteorologica();

	 // 2. Crie os Observers (os displays), passando a estação para eles
	 DisplayCelular displayCelular = new DisplayCelular(estacao);
	 DisplayWeb displayWeb = new DisplayWeb(estacao);

	 System.out.println("\n--- Mudando a temperatura pela primeira vez ---");
	 estacao.setTemperatura(25.5f);

	 System.out.println("\n--- Mudando a temperatura novamente ---");
	 estacao.setTemperatura(28.0f);

	 System.out.println("\n--- Removendo o observador do celular ---");
	 estacao.removerObserver(displayCelular);

	 System.out.println("\n--- Mudando a temperatura pela última vez ---");
	 estacao.setTemperatura(26.3f);
	 }
	}
