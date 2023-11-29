package jeu;

import cartes.Attaque;
import cartes.Carte;
import cartes.DebutLimite;

public class Coup {
	private Carte carte;
	private Joueur joueur;
	public Coup(Carte carte, Joueur joueur) {
		this.carte=carte;
		this.joueur=joueur;
	}
	public Carte getCarte() {
		return carte;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	
	public boolean estValide(Joueur j) {
		return (carte instanceof Attaque || carte instanceof DebutLimite);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Coup) {
			Coup coup = (Coup) obj;
			return carte.equals(coup.carte) && joueur.equals(coup.joueur);
		} else {
			return false;
		}
	}

	@Override 
	public int hashCode() {    
		return 31 * (carte.hashCode()+joueur.hashCode()); 
	}
	
	public boolean jouer (Joueur j) {
		if (estValide(j)) {
			j.getJeu().sabot.ajouterFamilleCarte(carte);
			return true;
		}else {
			boolean coupPossible=carte.appliquer(j);
			j.getMain().prendre(carte);
			System.out.println("Le joueur repose la carte "+carte);
			return coupPossible;
		}
	}

}
