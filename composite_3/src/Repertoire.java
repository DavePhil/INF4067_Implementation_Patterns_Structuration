import java.util.ArrayList;
import java.util.List;

/*
Classe représentant le composite qui définir le comportement des composants ayant des fils et implémente les autres méthodes
nécessaires à leur gestion
 */
public class Repertoire extends Element {
    private List<Element> sousRepertoire = new ArrayList<>();
    public Repertoire(String name, Type type) {
        super(name, type);
    }
    public Repertoire(){
        super();
    }
    @Override
    public void decrire() {
        super.decrire();
        for (Element element : sousRepertoire){
            element.decrire();
        }
    }
    public void ajouter(Element element){
        sousRepertoire.add(element);
//        System.out.println(element.getName() + "a ete ajoute");
    }
    public void remove (Element element){
        sousRepertoire.remove(element);
//        System.out.println(element.getName() + "a ete retire");
    }
    public Element get(int index){
        return  sousRepertoire.get(index);
    }
}
