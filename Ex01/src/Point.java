
public class Point {
	private int x;
	private int y;
	
	public Point(int _x, int _y){
		x=_x;
		y=_y;
	}
	
	@Override
	public String toString() {
		return x+", "+y;
	}

}
