import java.util.ArrayList;
import java.util.List;

/*
définit le comportement des composants ayants des fils et implémente les opérations nécessaires leur gestion.
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public void addComponent(Component component){
        children.add(component);
    }
    public void removeComponent(Component component){
        children.remove(component);
    }
    public Component getComponent(Component component){
        Component component1 = null;
        if (children.contains(component)) component1 = component;
        return component1;
    }

    @Override
    public void operation() {
        children.forEach(child -> {
           child.operation1();
           child.operation2();
        });
    }
    public int getComponentCount(){
        return children.size();
    }
}
