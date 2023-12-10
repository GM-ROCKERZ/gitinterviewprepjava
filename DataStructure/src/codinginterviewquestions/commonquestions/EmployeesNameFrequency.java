package codinginterviewquestions.commonquestions;

import java.util.*;

public class EmployeesNameFrequency
{
    public static void main(String args[])
    {
        List<EmployeesFilter.Employee> employees = Arrays.asList(
          new EmployeesFilter.Employee("Jhon","New York",5000),
                new EmployeesFilter.Employee("Jane","New York",6000),
                new EmployeesFilter.Employee("Bob","Chicago",4500),
                new EmployeesFilter.Employee("Alice","Chicago",5500),
                new EmployeesFilter.Employee("Sam","San Francisco",7000),
                new EmployeesFilter.Employee("Emily","San Francisco",6500),
                new EmployeesFilter.Employee("Jhon","Chicago",5500),
                new EmployeesFilter.Employee("Jane","San Francisco",6500),
                new EmployeesFilter.Employee("Bob","San Francisco",7000)
        );
        Map<String,Integer> namesFrequencyMap = new HashMap<>();
        for (EmployeesFilter.Employee employee:employees)
        {
            String name = employee.getName();
            namesFrequencyMap.put(name,namesFrequencyMap.getOrDefault(name,0)+1);

        }
        System.out.println("Name frequency: "+namesFrequencyMap);
    }
}
