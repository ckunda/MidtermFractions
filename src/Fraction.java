
public class Fraction {
	
	private int top;
	private int bottom;
	
	public Fraction() {
		this.top = 0;
		this.bottom = 0;
	}

	public Fraction(int top, int bottom) {
		this.top = top;
		this.bottom = bottom;
	}
	
	public Fraction(Fraction f) {
		this.top = f.getTop();
		this.bottom = f.getBottom();
	}

	public int getTop() { return top; }
	public void setTop(int top) { this.top = top; }
	public int getBottom() { return bottom; }
	public void setBottom(int bottom) { this.bottom = bottom; }

	@Override
	public String toString() {
		return top + "/" + bottom;
	}
}
