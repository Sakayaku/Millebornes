package cartes;

public class Botte extends Bataille {

	public Botte(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		switch (super.type) {
		case FEU:
			return "VéhiculePrioritaire: La carte Véhicule Prioritaire est la carte la plus puissante du jeu ! Une fois que vous avez posé cette Botte, vos adversaires ne peuvent plus vous attaquer avec une carte Feu Rouge ni avec une carte Limite de Vitesse. Précision : si vous exposez cette carte au début de la partie, vous êtes dispensé de poser un Feu Vert pour démarrer.";
		case ESSENCE:
			return "Citerne d'essence: Une fois que vous avez posé cette Botte, vos adversaires ne peuvent plus vous attaquer avec une carte Panne d’Essence.";
		case CREVAISON:
			return "Increvable: Une fois que vous avez posé cette Botte, vos adversaires ne peuvent plus vous attaquer avec une carte Crevaison.";
		case ACCIDENT:
			return "As du volant: Une fois que vous avez posé cette Botte, vos adversaires ne peuvent plus vous attaquer avec une carte Accident.";
		default:
			return "Y'a eu un soucis";
		}
			
	}
	
	

}
