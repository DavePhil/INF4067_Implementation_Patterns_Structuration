package Shape;

import color.Color;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Rectangle fill with: ");
        color.fillColor();
    }
}
