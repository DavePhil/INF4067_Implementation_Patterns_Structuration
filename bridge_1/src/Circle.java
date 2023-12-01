/*
Classe concrète représentant RefineAbstraction dans le modèle générique.
Il enrichit l'interface pour en faire une classe concrète
 */
public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Circle fill with: ");
        color.fillColor();
    }
}
