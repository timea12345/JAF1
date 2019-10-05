package shapes;

public interface Colorable {
    public static final int DEFAULT_COLOR_CODE = 0;

    static void describeBehaviour() {
        System.out.println("This is colorable");
    }

    default void printDefaultFieldColour() {
        System.out.println(String.format("Default color code is %d.", DEFAULT_COLOR_CODE));
    }

    abstract void render();

    class GenericColor {

    }
}
