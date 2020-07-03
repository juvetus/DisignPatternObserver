package fr.doranco.disign.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Eleve {

	private List<Observer> observers;
	private List<Float> notes;
	private float moyenne;

	public Eleve() {

		observers = new ArrayList<Observer>();
		notes = new ArrayList<Float>();

	}

	public void ajouterNote(float note) {
		notes.add(note);
		notifyAllObserver();
	}

	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;

	}

	public float getMoyenne() {
		return moyenne;
	}
	
	public List<Float> getNotes(){
		return notes;
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
