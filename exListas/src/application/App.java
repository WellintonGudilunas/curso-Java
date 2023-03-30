package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        
        System.out.print("How many employees will be registered: ");
        int employeesQuantity = sc.nextInt();

        for(int i = 1; i <= employeesQuantity; i++){
            System.out.println();
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream()
        .filter(x -> x.getId() == id)
        .findFirst()
        .orElse(null);
        if(emp == null){
            System.out.println("This id does note exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }



        // LISTA OS FUNCIONARIOS
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee employee : list){
            System.out.println(employee);
        }
        sc.close();
    }

    private static boolean hasId(List<Employee> list, int id) {
        return false;
    }
}