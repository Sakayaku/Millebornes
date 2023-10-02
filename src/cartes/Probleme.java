package cartes;

public abstract class Probleme extends Carte {

	protected Probleme(int nombre) {
		super(nombre);
	}
	public enum Type {FEU, ESSENCE, CREVAISON, ACCIDENT};
	Type type;
	public Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Probleme){
			Probleme probleme = (Probleme) obj;
		return type.equals(probleme.type);
		}else {
			return false;
		}
	}

}
