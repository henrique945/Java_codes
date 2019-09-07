/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corrida;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 190898
 */
public class AppCorrida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carOne = new Carro();
        Carro carTwo = new Carro();
        Random rand = new Random();

        //distancia em metros e velocidade em metros por segundo
        double distanciaTotal = 10000;
        String isBuraco;
        double timeOne, timeTwo;

        carOne.placa = "ABC-1234";
        carOne.motorista = "Henrique";
        carTwo.placa = "ABC-1234";
        carTwo.motorista = "Caio";
        
        System.out.println("Digite a velocidade inicial do carro um: ");
        carOne.velocidade = Double.parseDouble(scan.next());
        System.out.println("Digite a velocidade inicial do carro dois: ");
        carTwo.velocidade = Double.parseDouble(scan.next());

        System.out.println("A corrida tem buracos aleatórios <S/N>?");
        isBuraco = scan.next();
        
        for(int i=0; i<10; i++){
            carOne.velocidade += rand.nextDouble() * 10;
            carTwo.velocidade += rand.nextDouble() * 10;
        }
            
        if(isBuraco.equals("S") || isBuraco.equals("s")){
            double buraco = rand.nextDouble() * 10;
            
            //se o buraco random for entre 0 a 3 -> carro 1 passou no buraco
            //3 a 6 -> carro 2 passou no buraco
            //6 a 9.9 -> ambos desviaram
            if(buraco >= 0 && buraco <= 3){
                carOne.velocidade -= rand.nextDouble() * 10;
                System.out.println("\nCarro 1 acertou um buraco");
            }
            else if(buraco > 3 && buraco <= 6){
                carTwo.velocidade -= rand.nextDouble() * 10;
                System.out.println("\nCarro 2 acertou um buraco");
            }
            else if(buraco > 6 && buraco <= 9.9){
                System.out.println("\nAmbos desviaram dos buracos");
            }
        }
       
         //tempo em segundos
        timeOne = distanciaTotal/carOne.velocidade;
        timeTwo = distanciaTotal/carTwo.velocidade;
        
        //tempo em minutos
        timeOne /= 60;
        timeTwo /= 60;
       
        System.out.println("\nCarro 1 com velocidade " + carOne.velocidade + ", terminou em " + timeOne + " minutos");
        System.out.println("Carro 2 com velocidade " + carTwo.velocidade + ", terminou em " + timeTwo + " minutos");
        
        if(timeOne == timeTwo){
            System.out.println("Incrivel empate");
        }
        else if(timeOne > timeTwo){
            System.out.println("Carro 2 é o vencedor!!!");
        }
        else{
            System.out.println("Carro 1 é o vencedor!!!");
        }
        
        
    }
    
    
    
    
    
    
    
}
