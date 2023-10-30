public class Rectangle {

    private float longueur;
    private float largeur;

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
    public void setLongueur(float longueur){
        this.longueur = longueur;
    }
    public float perimetre(){
        return (largeur+longueur)*2;
    }

    public float aire(){
        return largeur*longueur;
    }

}
