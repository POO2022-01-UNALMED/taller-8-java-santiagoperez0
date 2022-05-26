package futbol;

public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private String posicion;
	public Futbolista(String nombre, int edad, String pos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = pos;
	}
	public Futbolista() {
		this.nombre="Maradona";
		this.edad=30;
		this.posicion="delantero";
	}
    public String toString() {
    	return "El futbolista "+nombre+" tiene "+edad+", y juega de "+posicion;
    }
    public boolean equals(Futbolista f) {
    	if(this == f) {
			return true;
		}
		else {
			return false;
		}
    }
    public abstract boolean jugarConLasManos();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
