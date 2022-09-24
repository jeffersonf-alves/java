package area_do_triangulo;

public class Calculator {
	
	public static final double PI = 3.14;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius / 3.0;
	}
}
