/*
Devoir réalisé par CHEDJOUN KENGUEP Dave 20U2757 Master 1 spécialité SIGL
Classe cliente qui utilise
 */
public class Main {
    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire("Dossier1", Type.DOSSIER);
        Fichier fichier1 = new Fichier("Fichier1 ", Type.PDF);
        Fichier fichier2 = new Fichier("Fichier2 ", Type.TXT);
        Fichier fichier3 = new Fichier("Fichier3 ", Type.TXT);
        Repertoire sousRepertoire = new Repertoire("SousDossier1", Type.DOSSIER);
        Repertoire sousSousRepertoire = new Repertoire("SousSousDossier", Type.DOSSIER);
        repertoire.ajouter(fichier1);
        repertoire.ajouter(fichier2);
        repertoire.ajouter(sousRepertoire);
        sousRepertoire.ajouter(fichier2);
        sousRepertoire.ajouter(sousSousRepertoire);
        sousSousRepertoire.ajouter(fichier3);
        System.out.println("=============================================");
        System.out.println("*** 3 sous dossier avec chacun un fichier ***");
        System.out.println("=============================================");
        repertoire.decrire();
        sousRepertoire.remove(sousSousRepertoire);
        System.out.println("================================");
        System.out.println("*** Suppression d'un dossier ***");
        System.out.println("================================");
        repertoire.decrire();
    }
}