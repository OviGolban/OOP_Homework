
public class Main {

	public static void main(String[] args) {
		PetHotel monaco = new PetHotel();
		
		Caine caine1 = new Caine("Rex","Pitbull", 3);
		Caine caine2 = new Caine("Tom","Bulldog",2);
		Caine caine3 = new Caine("Tudi","Pudel",1);
		Caine caine4 = new Caine("Jerry", "Ciobanesc", 2);
		
		monaco.addPereche(1, caine1);
		monaco.addPereche(2, caine2);
		monaco.addPereche(3, caine3);
		
		System.out.println("Nr de caini in hotel:" + monaco.dimensiune());
		
		monaco.afisareCaini();
		monaco.afisareCamere();
		
		monaco.setNewPereche(1, caine4);
		monaco.entrySet();
		
		

	}

}
