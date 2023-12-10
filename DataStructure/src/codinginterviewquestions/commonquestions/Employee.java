package codinginterviewquestions.commonquestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee
{
    private String name;
    private String city;

    public Employee(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
    public static void main(String args[])
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("john smith" ,"New york"));
        employees.add(new Employee("jane doe","chicago"));
        employees.add(new Employee("Bob johnson","Pune"));
        employees.add(new Employee("Sarah Lee","Pune"));

        //filtering and sorting employees who lives in Pune
        List<Employee> puneEmployees = employees.stream()
                .filter(e->e.getCity().equals("Pune"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        //printing the names of the employees who lives in Pune
        System.out.println("Employees who lives in Pune");
        puneEmployees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
