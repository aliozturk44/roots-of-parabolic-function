import java.util.Scanner;
public class Ders9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		kökhesaplama kök=new kökhesaplama();
		
		System.out.println("ax^2+bx+c gibi parabollerin köklerini hesaplama...");
		System.out.println("parabolün a kat sayýsýný giriniz: ");
		double a=scan.nextDouble();
		System.out.println("parabolün b kat sayýsýný giriniz: ");
		double b=scan.nextDouble();
		System.out.println("parabolün c kat sayýsýný giriniz: ");
		double c=scan.nextDouble();
		
		System.out.println("kat sayýlarý girilen parabolün discriminantý: "+
		kök.getDiscriminant(a,b,c));
		
		System.out.println("kat sayýlarý girilen parabolün 1.kökü: "+
				kök.getKök1(a,b,c));
		
		System.out.println("kat sayýlarý girilen parabolün 2.kökü: "+
				kök.getKök2(a,b,c));
	}

}
