package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;
	public Jugador(String nombre, int edad, String pos, short golesMarcados, byte dorsal) {
		super(nombre, edad, pos);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
    public Jugador() {
    	super();
    	this.golesMarcados=289;
    	this.dorsal=7;
    }
    public int compareTo(Object j1) {
    	Jugador j=(Jugador) j1;
    	if (this.getEdad()>=j.getEdad()) {
    		return(this.getEdad()-j.getEdad());
    	}
    	else {
    		return(j.getEdad()-this.getEdad());
    	}
    }
    public String toString() {
    	return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
    }
    public boolean jugarConLasManos() {
    	return false;
    }
}
