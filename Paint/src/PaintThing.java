
public class PaintThing {
	public static void main (String[] args){
		paint application = new paint();
		application.addToScreen(new Rect());
		application.addToScreen(new Tri());
	}
}

class paint{
	public void addToScreen(Shape aShape) {
		aShape.draw();
	}
}

class Rect implements Shape{
	public void draw() {
		System.out.println("drew a rect");
	}
}

class Tri implements Shape{
	public void draw() {
		System.out.println("drew a Tri");
	}
}
