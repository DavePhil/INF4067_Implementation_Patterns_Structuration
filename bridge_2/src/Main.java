/*
Devoir réalisé par CHEDJOUN KENGUEP Dave Matricule 20U2757 Master1 SIGL
Classe cliente qui utilise une instance de l'abstraction
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new RedColor());
        Shape circle = new Circle(new BlueColor());
        Shape circle1 = new Circle(new YellowColor());
        System.out.println("*************** Debut ***************");
        rectangle.colorIt();
        circle.colorIt();
        circle1.colorIt();
        System.out.println("**************** Fin ****************");
    }
}