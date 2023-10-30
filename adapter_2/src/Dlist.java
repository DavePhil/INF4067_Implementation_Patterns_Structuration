/*
Classe à adapter pour pourvoir utliser l'interface
 */
public class Dlist<DNode> {
    public void insert(DNode pos, Object o){
        System.out.println("Insertion dans une liste chainée");
    }
    public void remove(DNode pos){
        System.out.println("Retirer l'element : "+ pos + " dans la liste chainée");
    }
    public void insertHead(Object object){
        System.out.println("Insere l'objet" + object + " en tête de liste");
    }
    public void insertTail(Object object){
        System.out.println("Insere l'objet " + object + " en top de liste");
    }
    public Object removeHead(){
        System.out.println("Retire l'objet en tête de liste");
        return new Object();
    }
    public Object removeTail(){
        System.out.println("Retire l'objet en top de liste");
        return new Object();
    }
    public Object getHead(){
        System.out.println("Recupere l'objet en tete de liste");
        return new Object();
    }
    public Object getTail(){
        System.out.println("Recupere l'objet en tete de liste");
        return new Object();
    }

}
