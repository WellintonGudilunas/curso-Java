package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*EX 001
    
         System.out.print("Quantidade de numeros: ");
         int n = sc.nextInt();
         int[] array = new int[n];
         for (int i = 0; i < array.length; i++){
             sc.nextLine();
             System.out.print("Enter a number: ");
             array[i] = sc.nextInt();
            }
            System.out.println("NUMEROS NEGATIVOS: ");
            for (int i = 0; i < array.length; i++){
                if(array[i] < 0){
                    System.out.println(array[i]);
                }
                
            }
        */

        /* EX 002
         
        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double somaAlturas = 0.0;
        int quantidadePessoasMenorQue16Anos = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            
            somaAlturas += alturas[i];
            if(idades[i] < 16){
                quantidadePessoasMenorQue16Anos += 1;
            }
        }
        double mediaAlturas = somaAlturas / alturas.length;
        double percent = quantidadePessoasMenorQue16Anos * 100.0 / n;
        System.out.println();
        System.out.printf("Altura media: %.2f \n", mediaAlturas);
        System.out.printf("Quantidade de pessoas com menos de 16 anos: %.1f %% \n", percent);
        for(int i = 0; i < n; i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }
        */

        /*EX 003
         
        */
        Rent[] array = new Rent[10];
        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ": ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            array[roomNumber] = new Rent(name, email);;
        }

        System.out.println("Busy rooms: ");
        System.out.println();
        for(int i = 0; i < 10; i++){
            if(array[i] != null)
                System.out.println(i + ": " + array[i]);
        }

         




        sc.close();


    }
}
