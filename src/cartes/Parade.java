package cartes;

public class Parade extends Bataille {
	public Parade(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public String toString() {
		switch (super.type) {
		case FEU:
			return "FeuVert";
		case ESSENCE:
			return "Essence";
		case CREVAISON:
			return "Roue de Secours";
		case ACCIDENT:
			return "Réparations";
		default:
			return "Y'a eu un soucis";
		}
	}
	
	

}
