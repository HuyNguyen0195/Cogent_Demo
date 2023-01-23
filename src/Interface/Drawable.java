package Interface;

enum Unit{
	pixel,inch,millimeter,
}
public interface Drawable {
	default void draw() {
		System.out.println("drawable here");
	}
	default void drawInQuote() {
		System.out.println("\"drawable quotes\"");
	}
	//public abstract boolean hasBeenDraw();
	public static String getStandardUnit() {
		return "unit";
	}
}
