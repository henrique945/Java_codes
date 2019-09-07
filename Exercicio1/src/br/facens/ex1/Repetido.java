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
public class Repetido {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int achou = 0;
        float n1 = Float.parseFloat(scan.next());
        float n2 = Float.parseFloat(scan.next());
        float n3 = Float.parseFloat(scan.next());
        
        if(n1 == n2){
            achou++;
        }
        else if(n1 == n3){
            achou++;
        }
        else if(n2 == n3){
            achou++;
        }
    
        if(achou == 0){
            System.out.println("Nao Repetidos");
        }
        else{
            System.out.println("Repetidos");
        }
        
    }
}
