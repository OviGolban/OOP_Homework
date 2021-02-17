public class Nebun extends Piesa {
	public Nebun() {super("Nebun");}
	private String nume;
	
	public boolean mutareValida(Coordonate pozitieActuala, Coordonate pozitieUrmatoare) {
		super.mutareValida(pozitieActuala,  pozitieUrmatoare);
		if(Math.abs(pozitieActuala.getX() - pozitieUrmatoare.getX()) == Math.abs(pozitieActuala.getY() - pozitieUrmatoare.getY())) {
			return true;
		}
		return false;
	}
	public String getNume() {return nume;};

}