/*
Décorateur concret qui définisse des complètements supplémentaires pouvant être ajoutées dynamiquement
 */
public class DecorateurFenetreVertical extends DecorateurFenetre{

    public DecorateurFenetreVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessinerCurseur() {
        System.out.println("Defilement Vertical");
    }

}
