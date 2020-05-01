import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class TestEmployee
{
    public static void main(String[] args)
    {
        //Create original list of employees
        ArrayList<Employee> employees1 = new ArrayList<>();
        Employee first = new Employee("123", "Bill");
        Employee second = new Employee("456", "David");
        Employee third = new Employee("789", "Lucy");
        employees1.add(third);
        employees1.add(second);
        employees1.add(first);
        //Print out original list
        System.out.print("Original list: ");
        for (Employee employee: employees1)
        {
            System.out.print(" " + employee.name);
        }
        //Clone original list before sort method is applied
        ArrayList<Employee> employees2 = (ArrayList<Employee>) employees1.clone();
        //Apply sort method with comparator to original list
        Collections.sort(employees1, new Comparator<Employee>()
        {
            public int compare(Employee a, Employee b)
            {
                return a.name.compareTo(b.name);
            }
        });
        //Print out original list after sort method
        System.out.print("\n");
        System.out.println("***Original list after Sort Method***");
        System.out.print("Original list: ");
        for (Employee employee: employees1)
        {
            System.out.print(" " + employee.name);
        }
        //Print out cloned list
        System.out.print("\n");
        System.out.println("***Cloned list***");
        System.out.print("Cloned list: ");
        for (Employee employee: employees2)
        {
            System.out.print(" " + employee.name);
        }
    }
}
