package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle.toString());
        */
        /* 
          
        Employee employee = new Employee();
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println("Employee: " + employee.toString());
        
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee.toString());
        */
        
        Student student = new Student();
        System.out.print("Student name: ");
        student.nome = sc.nextLine();
        
        System.out.print("Nota 1: ");
        student.nota1 = sc.nextDouble();
        
        System.out.print("Nota 2: ");
        student.nota2 = sc.nextDouble();
        
        System.out.print("Nota 3: ");
        student.nota3 = sc.nextDouble();

        if(student.situation() == "PASS"){
            System.out.println("FINAL GRADE: " + student.finalGrade());
            System.out.println(student.situation());
        } else {
            System.out.println("FINAL GRADE: " + String.format("%.2f", student.finalGrade()));
            System.out.println(student.situation());
            System.out.println("MISSING " + String.format("%.2f", student.missingPoints()) + " Points");
        }


        sc.close();

    }
}
