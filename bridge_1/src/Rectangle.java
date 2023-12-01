/*
Classe concrète représentant RefineAbstraction dans le modèle générique.
Il enrichit l'interface pour en faire une classe concrète
 */
public class Rectangle extends Shape{

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Rectangle fill with: ");
        color.fillColor();
    }
}
