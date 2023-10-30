public class DocumentHtml implements Document{
    @Override
    public int setContenu(String contenu) {
        System.out.println("Fixe le contenu : " + contenu + " au format HTML");
        return 0;
    }

    @Override
    public void dessine() {
        System.out.println("Dessine sur le format HTML");
    }

    @Override
    public void imprime() {
        System.out.println("Imprime le fichier HTML");
    }
}
