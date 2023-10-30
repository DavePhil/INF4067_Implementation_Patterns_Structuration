import java.util.ArrayList;
import java.util.List;

public  class Section extends Texte{
    protected List<Texte> sousSection = new ArrayList<>();

    public Section(String titre, String preambule) {
        super(titre, preambule);
    }
    public Section(){
        super();
    }
    public void ajout(Texte texte) {
        sousSection.add(texte);
    }




}
