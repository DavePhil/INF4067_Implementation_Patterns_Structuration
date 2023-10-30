/*
Devoir réalisé par CHEDJOUN KENGUEP Dave 20U2757 Master 1 specialité SIGL
Classe client qui utilise les objets implémentant l'interface
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*************** Debut ***************");
        Stack stack = new DListImplementStack();
        Object object = new Object();
        stack.push(object);
        stack.pop();
        stack.top();
        System.out.println("**************** Fin ****************");
    }

}