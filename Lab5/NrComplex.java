
public class NrComplex {
	private int parteReala;
	private int parteImaginara;
	
	public NrComplex(int parteReala,int parteImaginara) {
		this.parteReala = parteReala;
		this.parteImaginara = parteImaginara;
		
		
	}
	public void adunare(NrComplex x1) {
		this.parteReala += x1.parteReala;
		this.parteImaginara += x1.parteImaginara;
	}
	public int getParteReala() {
		return parteReala;
	}
	public void setParteReala(int parteReala) {
		this.parteReala = parteReala;
	}
	public int getParteImaginara() {
		return parteImaginara;
	}
	public void setParteImaginara(int parteImaginara) {
		this.parteImaginara = parteImaginara;
	}
	
	public String toString() {
		String rezultat = "" + parteReala;
		if(parteImaginara > 0)
			return rezultat + "+" + parteImaginara+ "j";
		else
			return rezultat + parteImaginara+"j";
			
	}
	public void scadere(NrComplex x1) {
		this.parteReala -= x1.parteReala;
		this.parteImaginara -= x1.parteImaginara;
	}
	public void inmultire(NrComplex x1) {
		this.parteReala = (this.parteReala * x1.parteReala) - (this.parteImaginara * x1.parteImaginara);
		this.parteImaginara = (this.parteReala * x1.parteImaginara) + (this.parteImaginara * x1.parteReala);
	}
	public void inmultireScalar(int x1)
	{
		this.parteReala *= x1;
		this.parteImaginara *= x1;
	}
}
