package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Main diagonal: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int linha =0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                if(matriz[linha][coluna] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);







        sc.close();
    }
}
