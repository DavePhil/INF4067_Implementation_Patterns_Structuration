/*
Devoir réalisé par CHEDJOUN KENGUEP Dave 20U2757 Master 1 Spécialité SIGL
Classe cliente utilisant
 */
public class Main {
    public static void main(String[] args) {
        Section section = new Section();
        final int[] i = {1}; // tableau pour attribuer des valeurs aux exécutions

        Texte sousSection1 = new Section("section1", "This is section1");
        Texte sousSection2 = new Section("section1", "This is section2");;
        Texte paragraph = new Paragraphe("Paragraphe1", "This is paragraph1");

        section.ajout(sousSection1);
        section.ajout(paragraph);
        section.ajout(sousSection2);

        section.sousSection.forEach((sec) ->{
            System.out.println("===== " + i[0] + ". =====");
            sec.get();
            System.out.println("Size "+ sec.longueur());
            i[0]++;
        });
    }
}