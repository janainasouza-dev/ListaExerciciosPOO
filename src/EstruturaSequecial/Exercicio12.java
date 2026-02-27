/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaSequecial;

import java.util.Scanner;

/**
 *
 * @author jana
 */
public class Exercicio12 {
      public static void main(String[] args)
        {
        Scanner entrada = new Scanner(System.in);      
        System.out.println("Quantas broas foram vendidas: ");
        int broas  = entrada.nextInt();
        System.out.println("Quantas paes foram vendidas: ");
        int paes  = entrada.nextInt();
        double total = paes * 0.12 + broas * 1.50;
        double poupanca = total * 0.10;
        System.out.println("Rendimento total: " + total);
        System.out.println("Rendimento total: " + poupanca);
        }
}


/*

public class CalcularDezPorcento {
    public static void main(String[] args) {
        double valorOriginal = 150.0;
        
        // Forma 1: Multiplicar por 0.10
        double dezPorcento = valorOriginal * 0.10;
        
        // Forma 2: Dividir por 10
        // double dezPorcento = valorOriginal / 10;

        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("10% do valor: R$ " + dezPorcento);
    }
}

*/