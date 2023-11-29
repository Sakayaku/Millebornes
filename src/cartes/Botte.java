package cartes;

import jeu.Joueur;

public class Botte extends Bataille {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public String toString() {
		switch (super.type) {
		case FEU:
			return "VéhiculePrioritaire";
		case ESSENCE:
			return "Citerne d'essence";
		case CREVAISON:
			return "Increvable";
		case ACCIDENT:
			return "As du volant";
		default:
			return "Y'a eu un soucis";
		}		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Botte){
			Botte botte = (Botte) obj;
		return type.equals(botte.type);
		}else {
			return false;
		}
	}
	
	@Override
	public boolean appliquer(Joueur j) {
		j.getEnsembleBotte().add(this);
		Attaque attaque=new Attaque(0,this.type);
		if (j.getPileBataille().contains(attaque)) {
			j.getPileBataille().remove(attaque);
		}
		return true;
	}
}
