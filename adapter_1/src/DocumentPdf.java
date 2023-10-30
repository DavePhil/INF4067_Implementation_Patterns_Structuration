/*
Classe représentant l'adapter pour les documents de types pdf
 */
public class DocumentPdf implements Document{

    private ComposantPdf composantPdf = new ComposantPdf();
    @Override
    public int setContenu(String contenu) {
        composantPdf.pdfFixeContenu(contenu);
        return 0;
    }

    @Override
    public void dessine() {

    }

    @Override
    public void imprime() {
        composantPdf.EnvoieImprimante();
    }
}
