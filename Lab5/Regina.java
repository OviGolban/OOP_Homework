
public class Regina extends Piesa {
	public Regina() {super("Regina");}
	
	public boolean mutareValida(Coordonate pozitieActuala, Coordonate pozitieUrmatoare)
	{
		int diffX = Math.abs(pozitieActuala.getX() - pozitieUrmatoare.getX());
		int diffY = Math.abs(pozitieActuala.getY() - pozitieUrmatoare.getY());
		if (diffX == diffY) return true;
		
		if((pozitieActuala.getX() == pozitieUrmatoare.getX() || pozitieActuala.getY() == pozitieUrmatoare.getY()))
		{
			return true;
		}
		
	return false;
	}

}
