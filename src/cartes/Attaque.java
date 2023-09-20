package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		switch (super.type) {
		case FEU:
			return "FeuRouge: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Feu Vert.";
		case ESSENCE:
			return "Panne d'Essence: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Essence.";
		case CREVAISON:
			return "Crevaison: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Roue de Secours.";
		case ACCIDENT:
			return "Accident: Cette carte se place sur la pile de Bataille d’un adversaire qui roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à ce qu’il recouvre cette attaque d’une carte Réparations.";
		default:
			return "Y'a eu un soucis";
		}
	}
	
	

}
