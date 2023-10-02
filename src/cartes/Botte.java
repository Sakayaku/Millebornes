package cartes;

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
	
	

}
