package jeu;

public class Sabot {
	public Sabot() {
		private int capacite=110;
		private Carte cartesJeu[capacite];
	}
	private int nbCartes;
	
	public boolean estVide() {
		return nbCartes==0;
	}
	private void ajouterCarte() throws IllegalStateException {
		if (nbCartes==capacite-1){
			throw new IllegalStateException();
		}
	}

}
