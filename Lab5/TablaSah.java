
public class TablaSah {
	private Coordonate[][] coordonate = new Coordonate[8][8];

	public TablaSah() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				coordonate[i][j] = new Coordonate(i, j);
			}
		}
		coordonate[0][0].setPiesa(new Nebun());
		coordonate[0][1].setPiesa(new Pion());
		coordonate[0][2].setPiesa(new Regina());
	}
		public void mutaPiesa(Coordonate pozitieActuala, Coordonate pozitieUrmatoare) {
			if(pozitieActuala.getPiesa().mutareValida(pozitieActuala, pozitieUrmatoare))
			{
				pozitieUrmatoare.setPiesa(pozitieActuala.getPiesa());
				System.out.println("Mutarea de la pozitia:" + pozitieActuala.getX() +"," + pozitieActuala.getY() + " la " + pozitieUrmatoare.getX() +"," + pozitieUrmatoare.getY()  +  " este valida!");
			}
			else {
				System.out.println("Mutarea de la pozitia:" + pozitieActuala.getX() +"," + pozitieActuala.getY() + " la " + pozitieUrmatoare.getX() +"," + pozitieUrmatoare.getY() +  " este invalida!");
			}
		}
		public static void main(String[] args) {
			TablaSah tabla = new TablaSah();
			Nebun nebun = new Nebun();
			Pion pion = new Pion();
			Regina regina = new Regina();
			tabla.mutaPiesa(tabla.coordonate[0][0], tabla.coordonate[2][2]);
			tabla.mutaPiesa(tabla.coordonate[0][1], tabla.coordonate[2][2]);
			tabla.mutaPiesa(tabla.coordonate[0][2], tabla.coordonate[1][2]);
		}
}
