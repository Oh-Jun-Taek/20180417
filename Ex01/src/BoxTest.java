
public class BoxTest {
	public static void main(String[] args) {
		Box a = new Box(10,20,30);
		Box b = new Box(10,20,30);
		System.out.println("a == b : "+a.isSameBox(b));
	}

}
