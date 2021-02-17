
public class Bibliotecar {
	private String nume;
	private int varsta;
	private int experienta;
	
	public Bibliotecar(String nume, int varsta, int experienta) {
		this.nume = nume;
		this.varsta = varsta;
		this.experienta = experienta;
	}
	public String toString() {
		return "Numele bibliotecarului este: " + nume + " are varsta de:" + varsta + " si experienta de " + experienta  +" ani";
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public int getExperienta() {
		return experienta;
	}
	public void setExperienta(int experienta) {
		this.experienta = experienta;
	}
	
}
