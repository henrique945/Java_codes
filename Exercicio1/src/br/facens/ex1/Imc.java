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
public class Imc {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        float peso = Float.parseFloat(scan.next());
        System.out.println("Digite sua altura: ");
        float altura = Float.parseFloat(scan.next());
        
        float imc = peso/(altura*altura);
        
        System.out.println(imc);
        if(imc < 18.5f){
            System.out.println("Abaixo do peso");
        }
        else if(imc >= 18.5f && imc < 25.0f){
            System.out.println("Peso ideal");
        }
        else if(imc >= 25.0f && imc < 30.0f){
            System.out.println("Sobrepeso");
        }
        else if(imc >= 30.0f && imc < 35.0f){
            System.out.println("Obesidade de grau I");
        }
        else if(imc >= 35.0f && imc < 40.0f){
            System.out.println("Obesidade de grau II");
        }
        else{
            System.out.println("Obesidade de grau III");
        }
        
        
        
    }
}
