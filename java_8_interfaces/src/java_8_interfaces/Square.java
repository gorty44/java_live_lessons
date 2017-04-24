package java_8_interfaces;

public class Square implements RegularPolygon {

	private int sideLength;

	public Square(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public int getNumSlides() {
		return 4;
	}

	@Override
	public int getSideLength() {
		return this.sideLength;
	}

}
