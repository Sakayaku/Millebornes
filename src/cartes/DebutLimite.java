package cartes;

import cartes.Probleme.Type;
import jeu.Joueur;

public class DebutLimite extends Limite {

	public DebutLimite(int nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		return ("Debut "+super.toString());
	}
	
	@Override
	public boolean appliquer(Joueur j) {
		if (!j.getEnsembleBotte().contains(VEHI_PRIO) && !(j.getPileLimite().getFirst() instanceof DebutLimite)) {
			j.getPileLimite().addFirst(this);
			return true;
		}
		return false;
	}

}
