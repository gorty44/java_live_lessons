package java_8_interfaces;

public class Test {
	public static void main(String[] args) {
		RegularPolygon[] rps = { new Square(5), new EquilateralTriangle(2) };

		System.out.println(RegularPolygon.totalSlides(rps));
		System.out.println(rps[0].getPerimeter() + ", " + rps[1].getPerimeter());

		System.out.println(rps[0].getInteriorAngle() + ", " + rps[1].getInteriorAngle());
		
		
	}
}
