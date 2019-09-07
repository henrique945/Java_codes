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
public class Intervalo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //recebendo intervalos
        System.out.println("Digite o primeiro intervalo: ");
        int a = Integer.parseInt(scan.next());
        System.out.println("Digite o segundo intervalo: ");
        int b = Integer.parseInt(scan.next());
        int aux, achou = 0;
        
        //caso o segundo intervalo seja menor que o primeiro, trocar
        if(a > b){
           aux = b;
           b = a;
           a = aux;
        }
        
        //recebendo numero desejado
        System.out.println("Digite o numero desejado: ");
        int num = Integer.parseInt(scan.next());
        if(a == num || b == num){
            System.out.println("O numero está nas extremidas do intervalo");
        }
        else{
            //verificando se o numero recebido está dentro ou fora do intervalo
            for(int i=a+1;i<b;i++){
                if(num == i){
                    achou++;
                }
            }
            
            if(achou == 0){
                System.out.println("O numero está fora do intervalo");
            }
            else{
                System.out.println("O numero está dentro do intervalo");
            }
            
        }
        
        
        
        
    }
    
    
}
