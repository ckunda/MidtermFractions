
public class FractionsCalc {

	private Fraction f1;
	private Fraction f2;
	private Fraction result;
	
	public FractionsCalc() {
		this.f1 = new Fraction();
		this.f2 = new Fraction();
		this.result = new Fraction();
	}
	
	public FractionsCalc(Fraction f1, Fraction f2) {
		this.f1 = new Fraction(f1);
		this.f2 = new Fraction(f2);
		this.result = new Fraction();
	}
	
	public FractionsCalc(FractionsCalc fc) {
		this.f1 = new Fraction(fc.f1);
		this.f2 = new Fraction(fc.f2);
		this.result = new Fraction(fc.result);
	}

	public Fraction getF1() { return f1; }
	public void setF1(Fraction f1) { this.f1 = f1; }
	public Fraction getF2() { return f2; }
	public void setF2(Fraction f2) { this.f2 = f2; }
	public Fraction getResultString() { return result; }

	public double getResult() {
		double r = (double) result.getTop() / (double) result.getBottom();
		return r;
	}
	
	public void add() {
		if (f1.getBottom() != f2.getBottom()) {
			result.setTop(f1.getTop() * f2.getBottom()
					+ f2.getTop() * f1.getBottom());
			result.setBottom(f1.getBottom() * f2.getBottom());
		}
		else {
			result.setTop(f1.getTop() + f2.getTop());
			result.setBottom(f1.getBottom());
		}
	}
	
	public void mult() {
		result.setTop(f1.getTop() * f2.getTop());
		result.setBottom(f1.getBottom() * f2.getBottom());
	}
	
	@Override
	public String toString() {
		return String.format("FractionsCalc [f1=%s, f2=%s, result=%s]"
				, f1, f2, result);
	}
}
