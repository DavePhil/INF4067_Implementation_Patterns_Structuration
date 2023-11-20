public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new RedColor());
        Shape circle = new Circle(new BlueColor());
        Shape triangle = new Triangle(new YellowColor());
        System.out.println("*************** Debut ***************");
        rectangle.colorIt();
        circle.colorIt();
        triangle.colorIt();
        System.out.println("**************** Fin ****************");
    }
}