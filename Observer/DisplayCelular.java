package Observer;


	public class DisplayCelular implements Observer {
		 private Subject estacaoMeteorologica;
		 public DisplayCelular(Subject estacaoMeteorologica) {
		 this.estacaoMeteorologica = estacaoMeteorologica;
		 // Adiciona este display à lista de observadores da estação
		 this.estacaoMeteorologica.adicionarObserver(this);
		 }
		 @Override
		 public void atualizar() {
		 // A lógica de atualização do display
		 // Note que ele puxa o dado da estação
		 if (estacaoMeteorologica instanceof EstacaoMeteorologica) {
		 EstacaoMeteorologica estacao = (EstacaoMeteorologica) estacaoMeteorologica;
		 System.out.println("Display do Celular: A temperatura atual é " +
		estacao.getTemperatura() + "°C");
		 }
		 }
		}
