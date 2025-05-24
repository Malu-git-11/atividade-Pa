/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulamatriz;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aulamatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int linhaM = -1;
        int colM = -1;
        
        System.out.println("----------- Programa comparativo Mior e Menor numeros");
        
        for (int i = 0; i< 4; i++){
            
            for (int j=0; j< 4; j++){
            
                System.out.println("valo9r da posicao [" + i + "] linha e [" + j + "] coluna" );
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] > maior){
                    maior = matriz [i][j];
                    linhaM = 1;
                    colM = 1;
                }
                else{}
            }
            }
        for ( int i = 0; i<4; i++){
            for ( int j=0;  j< 4; j++){
                
            }
            
            System.out.println();
            
        }   
        
        System.out.println("\n Maior numero da Matriz" +maior );
        System.out.println("\n Menor numero da Matriz" +colM );
        
        scanner.close();
        }
    }
    

