package cartes;

public abstract class Probleme extends Carte {

	protected Probleme(int nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	enum Type {FEU, ESSENCE, CREVAISON, ACCIDENT};
	Type type;
	public Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}

}
