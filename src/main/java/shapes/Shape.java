package shapes;

public abstract class Shape {
    private static Color defaultColor;
    protected int colorCode;

    //static nested class
    public static class Color extends Colorable.GenericColor {
        private final int red;
        private final int green;
        private final int blue;


        public Color(int red, int green, int blue) {
            this.blue = blue;
            this.green = green;
            this.red = red;
        }

        public void setColor(Color color) {
            defaultColor = color;
        }

        @Override
        public String toString() {
            return "Color{" +
                    "red=" + red +
                    ", green=" + green +
                    ", blue=" + blue +
                    '}';
        }


    }

    //inner class
    public class InnerPoint{
        private int x;
        private int y;
        private int z;

        public InnerPoint(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    //local inner class
   public static Shape.Color getDescriptiveColor(Shape.Color color) {
        class DescriptiveColor extends Shape.Color {

            public DescriptiveColor() {
                super(color.red, color.green, color.blue);
            }

            @Override
            public String toString() {
                return "you selected a color with RGB values" + color.red + " " + color.blue + " " + color.green;
            }
        }
        return new DescriptiveColor();
    }

    Shape() {
        System.out.println("Constructor shape");
    }
}
