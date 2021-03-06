package java_8_interfaces;

public class EquilateralTriangle implements RegularPolygon {

	private int sideLength;

	public EquilateralTriangle(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public int getNumSlides() {
		return 3;
	}

	@Override
	public int getSideLength() {
		return this.sideLength;
	}

}
