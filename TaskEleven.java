import java.util.List;
import java.util.ArrayList;

class TaskEleven {
    private String name;
    private double salary;
    private List<TaskEleven> subordinates;

    public TaskEleven(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(TaskEleven e) {
        subordinates.add(e);
    }

    public double getSalary() {
        return salary;
    }

    public List<TaskEleven> getSubordinates() {
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
    public double calculateTotalSalary(TaskEleven manager) {
        return manager.getSalary() + calculateSubordinatesTotalSalary(manager.getSubordinates(), 0);
    }


    private double calculateSubordinatesTotalSalary(List<TaskEleven> subordinates, int index) {
        if (index >= subordinates.size()) {
            return 0.0;
        }

        return calculateTotalSalary(subordinates.get(index)) +
                calculateSubordinatesTotalSalary(subordinates, index + 1);
    }

    public static void main(String[] args) {
        // Create employees
        TaskEleven manager = new TaskEleven("Alice", 100);
        TaskEleven emp1 = new TaskEleven("Bob", 5);
        TaskEleven emp2 = new TaskEleven("Charlie", 0);
        TaskEleven emp3 = new TaskEleven("Diana", 4);
        TaskEleven emp4 = new TaskEleven("salim", 55);

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




