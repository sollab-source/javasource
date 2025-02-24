package quiz;

public class Test03 {

	public static void drawShape(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		drawShape(circle);
		drawShape(rectangle);
	}
}