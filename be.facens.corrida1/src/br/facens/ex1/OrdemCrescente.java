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
public class OrdemCrescente {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //recebendo valores inteiros
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());

        
        if(a > b && a > c){ //a é maior
            if(b > c){ 
                System.out.println(c + " " + b + " " + a);
            }
            else{
                System.out.println(b + " " + c + " " + a);
            }
        }
        else if(b > a && b > c){ //b é maior
            if(a > c){
                System.out.println(c + " " + a + " " + b);
            }
            else{
                System.out.println(a + " " + c + " " + b);
            }
        }
        else{ //c é maior
            if(a > b){
                System.out.println(b + " " + a + " " + c);
            }
            else{
                System.out.println(a + " " + b + " " + c);
            }
        }
        
        
    }
}
