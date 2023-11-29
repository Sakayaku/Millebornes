package cartes;

import jeu.Joueur;

public class FinLimite extends Limite {

	public FinLimite(int nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		return ("Fin "+super.toString());
	}
	
	@Override
	public boolean appliquer(Joueur j) {
		if (!j.getEnsembleBotte().contains(VEHI_PRIO) && (j.getPileLimite().getFirst() instanceof DebutLimite)) {
			j.getPileLimite().addFirst(this);;
			return true;
		}
		return false;
	}

}
