package Observer;

import java.util.ArrayList;
import java.util.List;
public class EstacaoMeteorologica implements Subject {
 private List<Observer> observers;
 private float temperatura;
 public EstacaoMeteorologica() {
 this.observers = new ArrayList<>();
 }
 @Override
 public void adicionarObserver(Observer observer) {
 observers.add(observer);
 System.out.println("Novo observador adicionado.");
 }
 @Override
 public void removerObserver(Observer observer) {
 observers.remove(observer);
 System.out.println("Observador removido.");
 }
 @Override
 public void notificarObservers() {
 for (Observer observer : observers) {
 observer.atualizar();
 }
 }
 public void setTemperatura(float temperatura) {
 this.temperatura = temperatura;
 System.out.println("\n*** A temperatura mudou! ***");
 // Quando o estado muda, notificamos todos os observadores
 notificarObservers();
 }
 public float getTemperatura() {
 return temperatura;
 }
}
