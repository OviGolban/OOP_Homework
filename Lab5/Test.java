
public class Test {

	public static void main(String[] args) {
		NrComplex x1 = new NrComplex(2, 4);
		NrComplex x2 = new NrComplex(1, -9);
		NrComplex x3 = new NrComplex(3, 7);
		
		x1.inmultire(x2);
		System.out.println("Inmultire :" + x1.toString() );
		
		x1.adunare(x2);
		System.out.println("Suma primelor 2 nr este: " + x1.toString());

		x1.scadere(x3);
		System.out.println("Diferenta intre suma primelor 2 nr si x3 este: " + x1.toString());
		
		

		// NrComplex[][] mat = new NrComplex();
		Matrice a = new Matrice(3, 3);

		a.afisare();
		a.setElement(0, 0, x3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a.setElement(i, j, new NrComplex(3, 3));
			}
		}
		System.out.println("a=\n");
		a.afisare();
		
		Matrice b = new Matrice(3, 3);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				b.setElement(i, j, new NrComplex(4, 4));
			}
		System.out.println("b=\n");
		b.afisare();
		a.adunare(b);
		a.afisare();
		
		Matrice c = new Matrice(9, 3);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				c.setElement(i, j, new NrComplex(1, 1));
			}
		b.scadere(c);
		System.out.println("b -c = \n");
		b.afisare();
		
		b.inmultireScalar(2);
		b.afisare();
		
		
	}

}
