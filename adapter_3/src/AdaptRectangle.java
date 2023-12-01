public class AdaptRectangle implements ICarre{
    private Rectangle rectangle = new Rectangle();
    private float cote;

    public AdaptRectangle(float cote){
        this.cote = cote;
    }

    // Methode pour attribuer les valeurs à la longueur et à la largeur du rectangle
    public void setRectangle(){
        rectangle.setLongueur(cote);
        rectangle.setLargeur(cote);
    }
    @Override
    public float perimetre() {
        setRectangle();
        return rectangle.perimetre();
    }

    @Override
    public float aire() {
        setRectangle();
        return rectangle.aire();
    }
}
