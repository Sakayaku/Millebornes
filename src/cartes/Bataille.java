package cartes;

import jeu.Joueur;

public abstract class Bataille extends Probleme {

	protected Bataille(int nombre, Type type) {
		super(nombre, type);
	}
	@Override
	public String toString() {
		return "Bataille [type=" + type + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Bataille){
			Bataille bataille = (Bataille) obj;
		return type.equals(bataille.type);
		}else {
			return false;
		}
	}
	
	@Override
	public boolean appliquer(Joueur j) {
		Bataille sommet;
		if (j.getPileBataille().isEmpty()) {
			if (!j.getEnsembleBotte().contains(VEHI_PRIO)) {
				sommet=Carte.FEU_ROUGE;
			}else {
				sommet=Carte.FEU_VERT;
			}
		}else {
			sommet=j.getPileBataille().getFirst();
		}
		Botte botte=new Botte(1,sommet.type);
		if (sommet instanceof Attaque && !(j.getEnsembleBotte().contains(botte))) {
			if (this instanceof Parade && this.type==sommet.type) {
				j.getPileBataille().addFirst(this);
				return true;
			}
		}
		if (sommet instanceof Parade) {
			botte=new Botte (1,this.type);
			if ((this instanceof Attaque) && !(j.getEnsembleBotte().contains(botte))) {
				j.getPileBataille().addFirst(this);
				return true;
			}
		}
		return false;
	}

}
