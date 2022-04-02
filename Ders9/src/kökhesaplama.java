
public class k�khesaplama {
	
	
	public double getDiscriminant(double a , double b , double c) {
		double d=Math.pow(b, 2)-4*a*c;
		double f=Math.pow(d, 0.5);
		return f;
	}
	
	public double getK�k1(double a , double b, double c) {
		double d=Math.pow(b, 2)-4*a*c;
		double f=Math.pow(d, 0.5);
		double r1=(-b+f)/2*a;
		return r1;
	}
	
	public double getK�k2(double a , double b, double c) {
		double d=Math.pow(b, 2)-4*a*c;
		double f=Math.pow(d, 0.5);
		double r2=(-b-f)/2*a;
		return r2;
	}
	

}
