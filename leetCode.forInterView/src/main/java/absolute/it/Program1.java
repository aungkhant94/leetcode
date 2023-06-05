package absolute.it;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

    //Write a program to create a list with employee Names and age then find out and print
    // the employee names who's age is grater than 18 with the help of Stream API?

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setAge(20);
        emp1.setName("John");
        Employee emp2 = new Employee();
        emp2.setName("Nathan");
        emp2.setAge(16);
        employeeList.add(emp1);
        employeeList.add(emp2);
        List<Employee> res =  employeeList.stream().filter(e-> e.getAge()>18).collect(Collectors.toList());
        for (Employee e: res){
            System.out.println(e.getName()+" \t" + e.getAge());

        }
    }
}
