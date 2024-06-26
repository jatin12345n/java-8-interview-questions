package java_8_interview_programme;

import java_8_interview_programme.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMaxMinWithCollectors {


    static List<Employee> employeeList =
            Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
                    new Employee("Tom Jones", 45, 7000.00),
                    new Employee("Ethan Hunt", 65, 8000.00),
                    new Employee("Nancy Smith", 22, 10000.00),
                    new Employee("Deborah Sprightly", 29, 9000.00));

    public static void main(String[] args) {
        //TODO 1. find employee with max salary
        Optional<Employee> maxSalaryEmp =
                employeeList.stream()
                        .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:"
                + (maxSalaryEmp.isPresent() ? maxSalaryEmp.get() : "Not Applicable"));

        //TODO here we have created stream from list of String using .stream()
        // and we have used Collectors.maxBy method to get the min Age by passing employee salary inside comparing method

        //TODO 2. find employee with minimum age

        Optional<Employee> minAgeEmp =
                employeeList.stream()
                        .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));

        //TODO here we have created stream from list of String using .stream()
        // and we have used Collectors.minBy method to get the min Age by passing employee salary inside comparing method


        System.out.println("Employee with min age:" +
                (minAgeEmp.isPresent() ? minAgeEmp.get() : "Not Applicable"));

        //TODO count total salary of employee

        Double totalSalary = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary: " + totalSalary);


        //TODO In this example, the mapToDouble method is used to extract the salary field
        // from each Employee object in the employees List and transform it into a stream of
        // double values. The sum method is then used to calculate the total of these values.
    }

}
