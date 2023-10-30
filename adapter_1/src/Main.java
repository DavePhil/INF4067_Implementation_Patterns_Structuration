/*
Devoirs réalisés par CHEDJOUN KENGUEP Dave 20U2757 Master1 spécialité SIGL
Main ici représente le client ServeurWeb
 */
public class Main {
    public static void main(String[] args) {
        Document documentPdf = new DocumentPdf();
        Document documentHtml = new DocumentHtml();
        String contenu = "Very Good exercise";
        // Utilisation du document HTML
        System.out.println("*********************** Debut ***********************");
        System.out.println("========== Document HTML ==========");
        documentHtml.setContenu(contenu);
        documentHtml.imprime();
        System.out.println("");
        // Utilisation du document PDF
        System.out.println("========== Document PDF ==========");
        documentPdf.setContenu(contenu);
        documentPdf.imprime();
        System.out.println("************************ Fin ************************");
    }
}