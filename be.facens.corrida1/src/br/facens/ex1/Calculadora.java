/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.facens.ex1;

import java.util.Scanner;

/**
 *
 * @author 190898
 */
public class Calculadora {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //recebendo valores
        System.out.println("Digite o primeiro numero: ");
        float a = Float.parseFloat(scan.next());
        System.out.println("Digite o segundo numero: ");
        float b = Float.parseFloat(scan.next());
        
        //escolhendo a operação matemática
        System.out.println("Qual operação deseja");
        System.out.println("1-Adição  2-Subtração  3-Multiplicação  4-Divisão:");
        int opt = Integer.parseInt(scan.next());
        
        //aplicando a operação matemática
        if(opt == 1){
            System.out.println("Resposta: " + (a+b));
        }
        else if(opt == 2){
            System.out.println("Resposta: " + (a-b));
        }
        else if(opt == 3){
            System.out.println("Resposta: " + (a*b));
        }
        else if(opt == 4){
            System.out.println("Resposta: " + (a/b));
        }
        else{
            System.out.println("Opção invalida!");
        }
    }
    
    
}
