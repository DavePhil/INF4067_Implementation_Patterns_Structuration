/*
Classe abstraite ayant une reference vers un composant.
 */
public abstract class DecorateurFenetre implements Fenetre{

    protected Fenetre fenetreDecoree;

    public DecorateurFenetre(Fenetre fenetre){
        this.fenetreDecoree = fenetre;
    }
    @Override
    public void dessiner() {
        System.out.println("Fenetre Decore");
        fenetreDecoree.dessiner();
    }
    @Override
    public void decrire() {
        System.out.println("Fenetre Decore");
        fenetreDecoree.decrire();
    }

    public abstract void dessinerCurseur();
}
