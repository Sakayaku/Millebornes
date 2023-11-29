package cartes;

import cartes.Probleme.Type;
import jeu.Joueur;

public abstract class Carte {
	protected Carte(int nombre) {
		this.nombre = nombre;
	}

	private int nombre;
	public static final Botte VEHI_PRIO=new Botte(1,(Type.FEU));
	public static final Botte CITERNE_ESSENCE=new Botte(1,(Type.ESSENCE));
	public static final Botte AS_VOLANT=new Botte(1,(Type.ACCIDENT));
	public static final Botte INCREVABLE=new Botte(1,(Type.CREVAISON));
	public static final Attaque FEU_ROUGE=new Attaque(1,(Type.FEU));
	public static final Parade FEU_VERT=new Parade(1,(Type.FEU));
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getNombre() {
		return nombre;
	}
	
	public boolean appliquer(Joueur j) {
		return (j.getCollecBorne().contains(this) || j.getEnsembleBotte().contains(this) ||j.getPileBataille().contains(this) || j.getPileLimite().contains(this));
	}
}
