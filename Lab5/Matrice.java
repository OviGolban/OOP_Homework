
public class Matrice {
	NrComplex[][] mat;
	int nrLinii;
	int nrColoane;

	public Matrice(int n, int m) {
		// this.mat = new NrComplex[n][m];
		mat = new NrComplex[n][m];
		this.nrLinii = n;
		this.nrColoane = m;

	}

	public NrComplex[][] getMatrice() {
		return mat;
	}

	public void afisare() {
		for (int i = 0; i < nrLinii; i++) {
			for (int j = 0; j < nrColoane; j++) {
				System.out.println(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public NrComplex getElement(int i, int j) {
		return mat[i][j];
	}

	public void setElement(int i, int j, NrComplex a) {
		this.mat[i][j] = a;

	}

	public void adunare(Matrice b) {
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++) {
				mat[i][j].adunare(b.getElement(i, j));
			}

	}

	public void scadere(Matrice b) {
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++) {
				mat[i][j].scadere(b.getElement(i, j));
			}
	}
	

	public void inmultire(Matrice b) {
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++) {
				mat[i][j].inmultire(b.getElement(i, j));
			}

	}
	public void inmultireScalar(int k) {
		for(int i = 0; i < nrLinii; i++)
			for(int j = 0; j <nrColoane; j++)
				mat[i][j].inmultireScalar(k);
				
	}


}
