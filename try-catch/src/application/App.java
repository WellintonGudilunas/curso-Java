package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        method1();
        
        
        
        System.out.println("End of program");
        
    }
    public static void method1 (){
        System.out.println("*** METHOD 1 START ***");
        method2();

        System.out.println("*** END 1 START ***");

    }

    
    public static void method2 (){
        System.out.println("*** METHOD 2 START ***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] array = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(array[position]);
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();
        }
         catch (InputMismatchException e){
            System.out.println("Input error!");
        }
        System.out.println("*** METHOD 2 END ***");
        sc.close();
    }
}
