
public class Pion extends Piesa {
	public Pion() {super("Pion");}
	
	public boolean mutareValida(Coordonate pozitieActuala,Coordonate pozitieUrmatoare) {
		if(Math.abs(pozitieActuala.getY() - pozitieUrmatoare.getY()) == 1 && Math.abs(pozitieActuala.getX() - pozitieUrmatoare.getX()) == 0)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
