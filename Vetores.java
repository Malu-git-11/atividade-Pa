/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numero = new int [10];
        int soma = 0;
        System.out.println("---------Prgrama Soma e Media -------");
        System.out.println("Digite 10 numeros inteiros");
        for (int i = 0; i < numero.length;i++){
            System.out.println("Numero" + (i+1) + ":");  
            numero[i] = scanner.nextInt();
            soma+= numero[i];
        }
            double media = (double)soma /numero.length;
            
            System.out.println("A soma eh: " +soma);
            System.out.println("A media eh: " +media);
            
            scanner.close();
            
        }
        
    }
    

