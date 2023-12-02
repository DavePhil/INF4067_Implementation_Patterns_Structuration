import java.util.ArrayList;
import java.util.List;

/*
Classe composite qui définit le comportement des composants
 */
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

    @Override
    public void get() {
        super.get();
        for (Texte sousSection : sousSection){
            sousSection.get();
        }
    }
}
