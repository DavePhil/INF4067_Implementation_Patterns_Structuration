/*
Classe qui adapte l'interface pour qu'on puisse utiliser la classe Dlist
 */
public class DListImplementStack implements Stack {
    private Dlist dlist = new Dlist();
    @Override
    public void push(Object object) {
        dlist.insertTail(object);
    }

    @Override
    public Object pop() {
        return dlist.removeTail();
    }

    @Override
    public Object top() {
        return dlist.getTail();
    }
}
