/*
Classe concrète représentant ConcreteImplementation dans le modèle générique.
Elle réalise concrètement l'implémentation de l'interface
 */
public class RedColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Red Color");
    }
}
