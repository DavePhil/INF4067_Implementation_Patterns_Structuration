/*
la classe qui définit les objets initiaux auxquels de nouvelles fonctionnalités seront ajoutées
 */
public class FenetreSimple implements Fenetre{
    @Override
    public void dessiner() {
        System.out.println("Dessin de la fenêtre simple");
    }

    @Override
    public void decrire() {
        System.out.println("Description de la fenêtre simple");
    }
}
