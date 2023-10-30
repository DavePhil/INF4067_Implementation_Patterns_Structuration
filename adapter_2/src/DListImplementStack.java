/*
Classe qui adapte l'interface pour qu'on puisse utiliser la classe Dlist
 */
public class DListImplementStack extends Dlist implements Stack {

    @Override
    public void push(Object object) {
        insertTail(object);
    }

    @Override
    public Object pop() {
        return removeTail();
    }

    @Override
    public Object top() {
        return getTail();
    }
}
