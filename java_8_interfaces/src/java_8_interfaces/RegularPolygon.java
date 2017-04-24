package java_8_interfaces;

public interface RegularPolygon {
	int getNumSlides();

	int getSideLength();

	static int totalSlides(RegularPolygon[] array) {
		int sumOfSides = 0;
		for (RegularPolygon rp : array)
			sumOfSides += rp.getNumSlides();
		return sumOfSides;
	}

	default int getPerimeter() {
		return getNumSlides() * getSideLength();
	}

	default double getInteriorAngle() {
		return (getNumSlides() - 2) * Math.PI / getNumSlides();
	}
}
