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
public class MaiorNumeor {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //recebendo valores
        float n1 = Float.parseFloat(scan.next());
        float n2 = Float.parseFloat(scan.next());
        float n3 = Float.parseFloat(scan.next());
        
        //comparações
        if(n1 > n2 && n1 > n3){
            System.out.println(n1);
        }
        else if(n1 > n2 && n1 < n3){
            System.out.println(n3);
        }
        else{
            if(n2 > n3){
                System.out.println(n2);
            }
            else{
                System.out.println(n3);
            }
        }
        
    }
    
}
