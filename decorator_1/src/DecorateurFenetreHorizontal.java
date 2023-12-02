/*
Décorateur concret qui définisse des complètements supplémentaires pouvant être ajoutées dynamiquement
 */
public class DecorateurFenetreHorizontal extends DecorateurFenetre{

    public DecorateurFenetreHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessinerCurseur() {
        System.out.println("Defilement Horizontal");
    }

}
