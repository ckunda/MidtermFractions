
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nFraction Class:");
		Fraction f = new Fraction();
		Fraction f1 = new Fraction(1,2);
		Fraction f1copy = new Fraction(f1);
		Fraction f2 = new Fraction(3,4);

		System.out.println(" f = " + f.toString());
		System.out.println(" f1 = " + f1.toString());
		System.out.println(" f1copy = " + f1copy.toString());
		System.out.println(" f2 = " + f2.toString());

		System.out.println("\nFractionsCalc Class:");
		FractionsCalc fc = new FractionsCalc();
		System.out.println(" fc: " + fc.toString());
		FractionsCalc fc1 = new FractionsCalc(f1,f2);
		System.out.println(" fc1: " + fc1.toString());
		FractionsCalc fc1copy = new FractionsCalc(fc1);
		System.out.println(" fc1copy: " + fc1copy.toString());
		
		fc1.mult();
		System.out.println(" fc1 (after mult): " + fc1.toString());
		System.out.println(f1.toString() + " * " + f2.toString()
		+ " = " + fc1.getResultString() + " = " + fc1.getResult());

		fc1.add();
		System.out.println(" fc1 (after add): " + fc1.toString());
		System.out.println(f1.toString() + " + " + f2.toString()
		+ " = " + fc1.getResultString() + " = " + fc1.getResult());
	}
}
