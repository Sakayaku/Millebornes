package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterable <Carte>{
	private int nbCartes=0;
	private int capacite;
	private Carte[] pioche;
	public Sabot(int capacite) {
		this.capacite=capacite;
		pioche=new Carte[capacite];
	}
	private int nombreOperations=0;
	
	
	public boolean estVide() {
		return nbCartes==0;
	}
	private void ajouterCarte(Carte carte){
		if (nbCartes==(capacite-1)){
			throw new IndexOutOfBoundsException();
		}else {
			pioche[nbCartes]=carte;
			nbCartes++;
		}
	}
	public void ajouterFamilleCarte (Carte carte) {
		for (int i=0;i<carte.getNombre();i++) {
			ajouterCarte(carte);
		}
	}
	public void ajouterFamilleCarte (Carte... carte) {
		for (int i=0;i<carte.length;i++) {
			ajouterFamilleCarte(carte[i]);
		}
	}
	
	private class Iterateur implements Iterator <Carte>{
		private int indiceIterateur=0;
		private int nombreOperationReference=nombreOperations;
		private boolean nextEffectue=false;
		public boolean hasNext() {
			return indiceIterateur<nbCartes;
		}
		public Carte next() {
			verificationConcurrence();
			if (hasNext()) {
				Carte selection=pioche[indiceIterateur];
				indiceIterateur++;
				return selection;
			}else {
				throw new NoSuchElementException();
			}
		}
		@Override
		public void remove() {
			verificationConcurrence();
			if (nbCartes<1) {
				throw new IllegalStateException();
			}
			for (int i=indiceIterateur-1;i<nbCartes-1;i++) {
				pioche[i]=pioche[i+1];
			}
			indiceIterateur--;
			nbCartes--;
		}
		private void verificationConcurrence() {
			if (nombreOperations!=nombreOperationReference) {
				throw new ConcurrentModificationException(); 
			}
		}
	}

	@Override
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}
	
	public Carte piocher() {
		Iterator<Carte> iterateur=iterator();
		System.out.print("je pioche ");
		Carte current=iterateur.next();
		iterateur.remove();
		return current;
	}

}
