
public class Piesa {
	private String nume;
	
	public Piesa(String piesa) {
		this.nume = nume;
	}
	public boolean mutareValida(Coordonate pozitieActuala, Coordonate pozitieUrmatoare) {
		if(pozitieActuala.getX() < 0 || pozitieActuala.getX() > 7 || pozitieActuala.getY() < 0 || pozitieActuala.getY() > 7 ||
				pozitieUrmatoare.getX() < 0 || pozitieUrmatoare.getX() > 7 || pozitieUrmatoare.getY() < 0 || pozitieUrmatoare.getY() > 7 || pozitieUrmatoare.getPiesa() != null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public String getNume() {return nume;}
	public void setNume(String nume) {this.nume = nume;}
	
}
