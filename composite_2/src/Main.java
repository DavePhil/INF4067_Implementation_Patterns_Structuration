/*
Devoir réalisé par CHEDJOUN KENGUEP Dave 20U2757 Master 1 Spécialité SIGL
Classe cliente utilisant
 */
public class Main {
    public static void main(String[] args) {
        Section section = new Section("Section principale", "This is the principal section");
        Texte sousSection1 = new Section("section1", "This is section1");
        Texte sousSection2 = new Section("section2", "This is section2");
        Texte sousSection21 = new Section("section2.1", "This is section2.1");
        Texte paragraph = new Paragraphe("Paragraphe", "This is paragraph");
        section.ajout(sousSection1);
        section.ajout(sousSection2);
        section.ajout(paragraph);
        sousSection1.ajout(paragraph);
        sousSection2.ajout(paragraph);
        sousSection2.ajout(sousSection21);
        sousSection21.ajout(paragraph);
        System.out.println("===========================================================================");
        System.out.println("********************************** Debut **********************************");
        System.out.println("===========================================================================");
        section.get();
        System.out.println("===========================================================================");
        System.out.println("*********************************** Fin ***********************************");
        System.out.println("===========================================================================");

    }
}