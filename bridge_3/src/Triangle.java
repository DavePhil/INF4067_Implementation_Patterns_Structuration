/*
Classe concrète représentant RefineAbstraction dans le modèle générique.
Il enrichit l'interface pour en faire une classe concrète
 */
public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Triangle fill with: ");
        color.fillColor();
    }
}
