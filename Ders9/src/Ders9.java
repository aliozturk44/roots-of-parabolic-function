import java.util.Scanner;
public class Ders9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		k�khesaplama k�k=new k�khesaplama();
		
		System.out.println("ax^2+bx+c gibi parabollerin k�klerini hesaplama...");
		System.out.println("parabol�n a kat say�s�n� giriniz: ");
		double a=scan.nextDouble();
		System.out.println("parabol�n b kat say�s�n� giriniz: ");
		double b=scan.nextDouble();
		System.out.println("parabol�n c kat say�s�n� giriniz: ");
		double c=scan.nextDouble();
		
		System.out.println("kat say�lar� girilen parabol�n discriminant�: "+
		k�k.getDiscriminant(a,b,c));
		
		System.out.println("kat say�lar� girilen parabol�n 1.k�k�: "+
				k�k.getK�k1(a,b,c));
		
		System.out.println("kat say�lar� girilen parabol�n 2.k�k�: "+
				k�k.getK�k2(a,b,c));
	}

}
