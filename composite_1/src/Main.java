/*
Devoir réalisé par CHEDJOUN KENGUEP Dave 20U2757 Master 1 Spécialité SIGL
 */
public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.addComponent(new Leaf());
        composite.addComponent(new Leaf());
        composite.addComponent(new Leaf());
        int size = composite.getComponentCount();
        System.out.println("************** Debut **************");
        System.out.println("Le nombre de composite est : " + size);
        composite.operation();
        System.out.println("*************** Fin ***************");
    }
}