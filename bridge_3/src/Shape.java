/*
Classe abstraite représentant Abstraction dans le modèle génerique
elle définit l'interface de l'abstraction et gère une instance de la classe Implementation
 */
public abstract class Shape {
     Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract public void colorIt();

}
