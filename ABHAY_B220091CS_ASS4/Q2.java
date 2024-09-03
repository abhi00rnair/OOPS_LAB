import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Entity {
    String name;

    Entity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}


class Employee extends Entity {
    Employee(String name) {
        super(name);
    }
}


class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
}

class HierarchicalManager<T extends Entity> {
    private ArrayList<T> arr;

    HierarchicalManager() {
        arr = new ArrayList<>();
    }

    void addEntity(T t1) {
        arr.add(t1);
    }

    void removeEntity(T t1) {
        Iterator<T> it = arr.iterator();
        while (it.hasNext()) {
            if (it.next().equals(t1)) {
                it.remove();
                break;
            }
        }
    }

    List<T> getAllEntities() {
        return new ArrayList<>(arr);
    }

    List<T> getEntitiesByType(Class<? extends T> type) {
        List<T> result = new ArrayList<>();
        for (T entity : arr) {
            if (type.isInstance(entity)) {
                result.add(entity);
            }
        }
        return result;
    }

    void printHierarchy() {
        for (T entity : arr) {
            System.out.println(entity);
        }
    }
}


public class Q2 {
    public static void main(String[] args) {
        HierarchicalManager<Entity> manager = new HierarchicalManager<>();
        Employee emp1 = new Employee("John Doe");
        Employee emp2 = new Employee("Jane Smith");
        Manager mgr1 = new Manager("Alice Johnson");

        manager.addEntity(emp1);
        manager.addEntity(emp2);
        manager.addEntity(mgr1);

        System.out.println("All Entities:");
        manager.printHierarchy();
        System.out.println("\nEmployees:");
        List<Entity> employees = manager.getEntitiesByType(Employee.class);
        for (Entity e : employees) {
            System.out.println(e);
        }
        manager.removeEntity(emp2);
        System.out.println("\nEntities after removal:");
        manager.printHierarchy();
    }
}
