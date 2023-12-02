/*
Devoir réalisé par CHEDJOUN KENGUEP Dave Matricule 20U2757 Master1 SIGL
Classe cliente qui utilise le decorateur pour décorer les objets
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*************** Debut ***************");
        Fenetre fenetreA = new FenetreSimple();
        DecorateurFenetre fenetreB = new DecorateurFenetreVertical(fenetreA);
        System.out.println("============ 1 decoration ============");
        fenetreB.decrire();
        fenetreB.dessinerCurseur();
        System.out.println("============ 2 decoration ============");
        DecorateurFenetre fenetreC= new DecorateurFenetreHorizontal(fenetreB);
        fenetreC.decrire();
        fenetreC.dessinerCurseur();
        System.out.println("**************** Fin ****************");
    }
}