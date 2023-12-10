package codinginterviewquestions.commonquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesFilter
{
    static class Employee
    {
       private final String name;
       private final String location;
       private final int salary;

        public Employee(String name, String location, int salary) {
            this.name = name;
            this.location = location;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String args[])
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Jhon","New York",5000),
                new Employee("Jane","New York",6000),
                new Employee("Bob","Chicago",4500),
                new Employee("Alice","Chicago",5500),
                new Employee("Sam","San Francisco",7000),
                new Employee("Emily","San Francisco",6500)
        );

        String location = "Chicago";
        List<Employee> filteredEmployees = employees.stream()
                .filter(e->e.getLocation().equals(location))
                .sorted(Comparator.comparing(Employee::getName))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("Filtered Employees:"+filteredEmployees);

    }

}
