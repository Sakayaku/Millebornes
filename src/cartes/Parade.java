package cartes;

public class Parade extends Bataille {
	public Parade(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		switch (super.type) {
		case FEU:
			return "FeuVert: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Feu Vert.";
		case ESSENCE:
			return "Essence: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Essence.";
		case CREVAISON:
			return "Roue de Secours: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Roue de Secours.";
		case ACCIDENT:
			return "Réparations: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Réparations.";
		default:
			return "Y'a eu un soucis";
		}
	}
	
	

}
