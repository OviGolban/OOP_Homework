
public class Coordonate {
	private int x;
	private int y;
	private Piesa piesa;
	
	public Coordonate(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	
	public Piesa getPiesa()  {return piesa;}
	public void setPiesa(Piesa piesa) {this.piesa = piesa;}
	
	

}
