package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public String toString() {
		switch (super.type) {
		case FEU:
			return "FeuRouge";
		case ESSENCE:
			return "Panne d'Essence";
		case CREVAISON:
			return "Crevaison";
		case ACCIDENT:
			return "Accident";
		default:
			return "Y'a eu un soucis";
		}
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Attaque){
			Attaque attaque = (Attaque) obj;
		return type.equals(attaque.type);
		}else {
			return false;
		}
	}

	
	
	

}
