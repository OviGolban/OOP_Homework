import java.awt.Color;

public class Biblioteca {
	private String volum;
	private String autor;
	private Color culoareCoperta;
	private int numarVolume;
	private int numarAutori;
	
	private Bibliotecar bibliotecar;
	
	public Bibliotecar getBibliotecar() {
		return bibliotecar;
	}
	public void setBibliotecar(Bibliotecar bibliotecar) {
		this.bibliotecar = bibliotecar;
	}
	
	private OrarFunctionare orar;
	
	public OrarFunctionare getOrarFunctionare() {
		return orar;
	}
	
	public void setOrarFunctionare(OrarFunctionare orar) {
		this.orar = orar;
	}
	
	public Biblioteca() {
		this("Necunoscuta", "Necunoscut", Color.BLUE);
	}
	public Biblioteca(String volum, String autor, Color culoareCoperta) {
		this.volum = volum;
		this.autor = autor;
		this.culoareCoperta = culoareCoperta;
	}
	
	public String getVolum() {
		return volum;
	}
	public void setVolum(String volum) {
		this.volum = volum;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Color getCuloareCoperta() {
		return culoareCoperta;
	}
	public void setCuloareCoperta(Color culoareCoperta) {
		this.culoareCoperta = culoareCoperta;
	}
	public int getNumarVolume() {
		return numarVolume;
	}
	public void setNumarVolume(int numarVolume) {
		this.numarVolume = numarVolume;
	}
	public int getNumarAutori() {
		return numarAutori;
	}
	public void setNumarAutori(int numarAutori) {
		this.numarAutori = numarAutori;
	}

	public String toString() {
		return "Volumul " + volum + " scris de "+ autor + " care are culoarea copertii " + culoareCoperta + " se regaseste in depozit intr-o cantitate de:" + numarVolume + "totalul autorilor din biblioteca fiind:" + numarAutori;
	}
}

