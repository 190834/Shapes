
public class Shapes {
	public static void main(String[] args) {
		Rectangle();
		Circle();
		Triangle();

	}

	public static void Rectangle() {
		int height = 5;
		int width = 10;
		System.out.println(height * width);

	}

	public static void Circle() {
		int radius = 2;
		System.out.println(3.14 * (radius * radius));

	}

	public static void Triangle() {
		
		int height = 5;
		int width = 10;
		System.out.println((height * width) / 2);

	}
}
