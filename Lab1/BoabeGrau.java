import static java.lang.Math.sqrt;
import java.math.BigInteger;
import java.util.*;


public class BoabeGrau {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		/*System.out.println("Dati dimensiunea tablei de sah n = ");
		int n = in.nextInt();
		double sum = 0;
		//double pow(double base, double exponent);
		for(int i = 0; i < n; i++)
		{
			sum =sum + Math.pow(2, i);
		}*/
		//BigInteger numar = new BigInteger("2");
		BigInteger prog = BigInteger.TWO.pow(63).subtract(BigInteger.ONE);
		
		System.out.println("Nr boabe de grau:" + prog);
	}
}
