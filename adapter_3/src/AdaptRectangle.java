public class AdaptRectangle implements ICarre{
    private Rectangle rectangle = new Rectangle();
    private float cote;

    public AdaptRectangle(float cote){
        this.cote = cote;
    }

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
