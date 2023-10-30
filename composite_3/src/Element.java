
/*
Interface representant le composant qui déclare le comportement par défaut des autres classes
 */
public class Element {
    private String name;
    private Type type;

    public Element(String name, Type type){
        this.name = name;
        this.type = type;
    }
    public Element(){

    }
    public void decrire(){
        System.out.println("Nom : "+ name + "type : "+ type);
    }
    
}
