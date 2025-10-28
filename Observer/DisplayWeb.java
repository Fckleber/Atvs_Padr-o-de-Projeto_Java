package Observer;

public class DisplayWeb implements Observer {
	 private Subject estacaoMeteorologica;
	 public DisplayWeb(Subject estacaoMeteorologica) {
	 this.estacaoMeteorologica = estacaoMeteorologica;
	 // Adiciona este display à lista de observadores da estação
	 this.estacaoMeteorologica.adicionarObserver(this);
	 }
	 @Override
	 public void atualizar() {
	 // A lógica de atualização do display
	 if (estacaoMeteorologica instanceof EstacaoMeteorologica) {
	 EstacaoMeteorologica estacao = (EstacaoMeteorologica) estacaoMeteorologica;
	 System.out.println("Display Web: Temperatura atualizada para " +
	estacao.getTemperatura() + "°C");
	 }
	 }
	}
