/*
Devoir réalisé par CHEDJOUN KENGUEP Dave Matricule 20U2757 Master1 SIGL
Classe cliente qui utilise une instance de l'abstraction
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new RedColor());
        Shape circle = new Circle(new BlueColor());
        Shape triangle = new Triangle(new YellowColor());
        Shape triangle2 = new Triangle(new GreenColor());
        System.out.println("*************** Debut ***************");
        rectangle.colorIt();
        circle.colorIt();
        triangle.colorIt();
        triangle2.colorIt();
        System.out.println("**************** Fin ****************");
    }
}