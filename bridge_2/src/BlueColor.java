/*
Classe concrète représentant ConcreteImplementation dans le modèle générique.
Elle réalise concrètement l'implémentation de l'interface
 */
public class BlueColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Blue Color");
    }
}
