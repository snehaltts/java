
abstract class Shape {
	
	protected int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	abstract void CalculateArea(int value);
}
