import java.awt.Color;

public class TestBiblioteca {
  public static void main(String[] args) {
	 Biblioteca biblioteca = new Biblioteca();
	 System.out.println(biblioteca.toString());
	 System.out.println(biblioteca.getAutor());
	 biblioteca.setAutor("Mihai Eminescu");
	 System.out.println(biblioteca.getAutor());
	 
	 Biblioteca universitara = new Biblioteca("Izvorul noptii","Lucian Blaga",Color.blue );
	 System.out.println(biblioteca.getVolum());
	 System.out.println(universitara.getVolum());
	 universitara.setNumarVolume(2500);
	 universitara.setNumarAutori(300);
	 System.out.println(universitara.toString());
	 
	 
	 Bibliotecar bibliotecar = new Bibliotecar("Maria Pop", 50, 30);
	 universitara.setBibliotecar(bibliotecar);
	 System.out.println(universitara.getBibliotecar());
	 
	 OrarFunctionare orar = new OrarFunctionare(8, 22, 14);
	 universitara.setOrarFunctionare(orar);
	 System.out.println(universitara.getOrarFunctionare());
	 
  }
}
