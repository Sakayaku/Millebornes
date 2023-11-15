package cartes;

public abstract class Probleme extends Carte {
	public enum Type {FEU, ESSENCE, CREVAISON, ACCIDENT};
	Type type;
	protected Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
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
