/*
Devoir réalisé par CHEDJOUN KENGUEP Dave 20U2757 Master1 Genie Logiciel
Classe cliente qui utilise les objets de l'interface
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*************** Debut ***************");
        float coteCarre = 25;
        ICarre icarre = new AdaptRectangle(coteCarre);
        System.out.println("Aire: "+icarre.aire());
        System.out.println("Perimetre: "+icarre.perimetre());
        System.out.println("**************** Fin ****************");
    }
}