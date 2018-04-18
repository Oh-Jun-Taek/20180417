
public class Circle {
	private int radius;
	private Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	@Override
	public String toString() {
		return "반지름 = "+radius+" 중심 = "+center;
	}

}
