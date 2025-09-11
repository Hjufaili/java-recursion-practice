import java.util.List;
import java.util.ArrayList;

class TaskElevent {
    private String name;
    private double salary;
    private List<TaskElevent> subordinates;

    public TaskElevent(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(TaskElevent e) {
        subordinates.add(e);
    }

    public double getSalary() {
        return salary;
    }

    public List<TaskElevent> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }
}

class Organization {
    /**
     * Calculates the total salary of a manager and all their subordinates recursively.
     *
     * Base case: If an employee has no subordinates, return only their salary.
     * Recursive case: Return the employee's salary plus the sum of total salaries
     * of all their subordinates.
     *
     * @param manager The root employee of the hierarchy to sum up.
     * @return The total salary of the manager and all subordinates.
     */
    public double calculateTotalSalary(TaskElevent manager) {
        return manager.getSalary() + calculateSubordinatesTotalSalary(manager.getSubordinates(), 0);
    }


    private double calculateSubordinatesTotalSalary(List<TaskElevent> subordinates, int index) {
        if (index >= subordinates.size()) {
            return 0.0;
        }

        return calculateTotalSalary(subordinates.get(index)) +
                calculateSubordinatesTotalSalary(subordinates, index + 1);
    }

    public static void main(String[] args) {
        // Create employees
        TaskElevent manager = new TaskElevent("Alice", 100);
        TaskElevent emp1 = new TaskElevent("Bob", 5);
        TaskElevent emp2 = new TaskElevent("Charlie", 0);
        TaskElevent emp3 = new TaskElevent("Diana", 4);
        TaskElevent emp4 = new TaskElevent("salim", 55);

        // Build hierarchy 
        manager.addSubordinate(emp1);
        manager.addSubordinate(emp2);
        emp2.addSubordinate(emp3);
        emp3.addSubordinate(emp4);
        // Calculate total salary
        Organization org = new Organization();
        double total = org.calculateTotalSalary(manager);
        System.out.println("Total salary for Alice and her team: " + total);
    }

}


