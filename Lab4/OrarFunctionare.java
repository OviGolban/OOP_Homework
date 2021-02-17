
public class OrarFunctionare {
	private int deschidere;
	private int inchidere;
	private int durataFunctionare;
	
	public OrarFunctionare(int deschidere, int inchidere, int durataFunctionare) {
		this.deschidere = deschidere;
		this.inchidere = inchidere;
		this.durataFunctionare = durataFunctionare;
		
	}
	
	public String toString() {
		return "Biblioteca se deschide la:" + deschidere + " se inchide la: " + inchidere + " cumuland un orar de functionare de " + durataFunctionare + " ore";
	}

	public int getDeschidere() {
		return deschidere;
	}

	public void setDeschidere(int deschidere) {
		this.deschidere = deschidere;
	}

	public int getInchidere() {
		return inchidere;
	}

	public void setInchidere(int inchidere) {
		this.inchidere = inchidere;
	}

	public int getDurataFunctionare() {
		return durataFunctionare;
	}

	public void setDurataFunctionare(int durataFunctionare) {
		this.durataFunctionare = durataFunctionare;
	}
	

}
