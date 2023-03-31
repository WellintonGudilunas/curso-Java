package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Linhas: ");
        int qtdLinhas = sc.nextInt();
        System.out.print("Colunas: ");
        int qtdColunas = sc.nextInt();
        int[][] matriz = new int[qtdLinhas][qtdColunas];

        
        for(int linhas = 0; linhas < matriz.length; linhas++){
            for(int colunas = 0; colunas < matriz[linhas].length; colunas++){
                matriz[linhas][colunas] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();
        
        for(int linhas = 0; linhas < matriz.length; linhas++){
            for(int colunas = 0; colunas < matriz[linhas].length; colunas++){
                if(matriz[linhas][colunas] == x){
                    System.out.println("Position " + linhas + ", " + colunas + ": ");
                    
                    if (colunas > 0) {
                        System.out.println("Left: " + matriz[linhas][colunas-1]);
					}
					if (linhas > 0) {
                        System.out.println("Up: " + matriz[linhas-1][colunas]);
					}
					if (colunas < matriz[linhas].length-1) {
                        System.out.println("Right: " + matriz[linhas][colunas+1]);
					}
					if (linhas < matriz.length-1) {
						System.out.println("Down: " + matriz[linhas+1][colunas]);
					}

                }
            }
        }
        
        sc.close();
    }
}
