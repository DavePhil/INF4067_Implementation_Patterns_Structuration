/*
Classe adaptée pour utiliser l'interface Document
 */
public class ComposantPdf {

    public int pdfFixeContenu(String contenu){
        if (contenu.isEmpty()) return 0;
        System.out.println("Fixe le contenu : " + contenu + " au format PDF");
        return 1;
    }

    public int pdfPrepareAffichage(){
        System.out.println("Prepare l'affichage du PDF");
        return 1;
    }

    public int pdfRafraichir(){
        System.out.println("Rafraichit le PDF");
        return 1;
    }

    public int pdfTermineAffichage(){
        System.out.println("Termine l'affichage du PDF");
        return 1;
    }

    public int EnvoieImprimante(){
        System.out.println("Imprime le fichier PDF");
        return 1;
    }
}
