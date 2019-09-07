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
        Carro carOne = new Carro("Henrique", "ABDX-124", 100, 2, 50);
        Carro carTwo = new Carro("Caio", "HJKL-098", 120, 4, 45);
        Random rand = new Random();

        //distancia em metros e velocidade em metros por segundo
        
        /*double distanciaTotal = 10000;
        String isBuraco;
        double timeOne, timeTwo;

        System.out.println("Digite a velocidade inicial do carro um: ");
        carOne.velocidade = Double.parseDouble(scan.next());
        System.out.println("Digite a velocidade inicial do carro dois: ");
        carTwo.velocidade = Double.parseDouble(scan.next());
        */
        
        //Carro1
        System.out.println("Digite a velocidade atual do primeiro carro: ");
        carOne.velocidadeAtual = Double.parseDouble(scan.next());
        System.out.println("Digite o combustivel atual do primeiro carro: ");
        carOne.combustivelDisponivel = Double.parseDouble(scan.next());
        System.out.println("Digite o consumo do primeiro carro: ");
        carOne.consumo = Double.parseDouble(scan.next());
        //Carro 2
        System.out.println("Digite a velocidade atual do segundo carro: ");
        carTwo.velocidadeAtual = Double.parseDouble(scan.next());
        System.out.println("Digite o combustivel atual do segundo carro: ");
        carTwo.combustivelDisponivel = Double.parseDouble(scan.next());
        System.out.println("Digite o consumo do segundo carro: ");
        carTwo.consumo = Double.parseDouble(scan.next());
        
        System.out.println("Digite a distancia total do percuso: ");
        int distanciaTotal = Integer.parseInt(scan.next());
        
        int opt = 0;
        while(opt != 6){
            System.out.println("--- MENU ---\n\nDigite:\n1-Acelerar\n2-Frear\n3-Andar\n4-Ver Combustivel Disponivel\n5-Reabaster\n6-Sair");
            opt = Integer.parseInt(scan.next());
            System.out.println("");
            clearConsole();
            
            switch(opt){
                case 1:
                    int result;
                    
                    //Carro1
                    double velocidade = rand.nextDouble() + 10;
                    result = carOne.acelerar(velocidade); //metros
                    System.out.println(carOne.motorista);
                    if(result == Carro.MOVEU){
                        System.out.println("Nova velocidade atual: " + carOne.velocidadeAtual);
                    }
                    else{
                        System.out.println("Aceleração falhou!");
                    }

                    //Carro2
                    velocidade = rand.nextDouble() + 10;
                    result = carTwo.acelerar(velocidade); //metros
                    System.out.println(carTwo.motorista);
                    if(result == Carro.MOVEU){
                        System.out.println("Nova velocidade atual: " + carTwo.velocidadeAtual);
                    }
                    else{
                        System.out.println("Aceleração falhou!");
                    }
                    
                    break;
                    
                case 2:
                    //Carro 1
                    double freio = rand.nextDouble() + 10;
                    result = carOne.frear(freio);
                    System.out.println(carOne.motorista);
                    if(result == Carro.MOVEU){
                        System.out.println("Velocidade atual: " + carOne.velocidadeAtual);
                    }
                    else{
                        System.out.println("Frenagem falhou");
                    }
                    
                    //Carro 2
                    freio = rand.nextDouble() + 10;
                    result = carTwo.frear(freio);
                    System.out.println(carTwo.motorista);
                    if(result == Carro.MOVEU){
                        System.out.println("Velocidade atual: " + carTwo.velocidadeAtual);
                    }
                    else{
                        System.out.println("Frenagem falhou");
                    }
                    
                    break;
                    
                case 3:
                    //Carro 1
                    double space = rand.nextDouble();
                    result = carOne.mover(space, carOne.combustivelDisponivel, carOne.consumo, distanciaTotal); //segundos
                    System.out.println(carOne.motorista);
                    
                    int vencedor1 = 0;
                    int vencedor2 = 0;
                    if(result == Carro.VENCEDOR){
                        System.out.println("Tempo de " + carOne.tempoAcumulado);
                        vencedor1++;
                        opt = 6;
                    }
                    else if(result == Carro.MOVEU){
                        System.out.println("Atual distancia percorrida: " + carOne.distanciaPercorrida);
                    }
                    else{
                        System.out.println("Movimento falhou!");
                    }
                    
                    //Carro 2
                    space = rand.nextDouble();
                    result = carTwo.mover(space, carTwo.combustivelDisponivel, carTwo.consumo, distanciaTotal); //segundos
                    System.out.println(carTwo.motorista);
                    
                    if(result == Carro.VENCEDOR){
                        System.out.println("Tempo de " + carTwo.tempoAcumulado);
                        vencedor2++;
                        opt = 6;
                    }
                    else if(result == Carro.MOVEU){
                        System.out.println("Atual distancia percorrida: " + carTwo.distanciaPercorrida);
                    }
                    else{
                        System.out.println("Movimento falhou!");
                    }
                    
                    //Vencedor
                    if(vencedor1 == 1 && vencedor2 == 1){
                        if(carOne.tempoAcumulado < carTwo.tempoAcumulado){
                          System.out.println("\n\n" + carOne.motorista + ", placa: " + carOne.placa + " é o vencedor!!!");
                        }
                        else{
                          System.out.println("\n\n" + carTwo.motorista + ", placa: " + carTwo.placa + " é o vencedor!!!");
                        }
                    }
                    else if(vencedor1 == 1){
                        System.out.println("\n\n" + carOne.motorista + ", placa: " + carOne.placa + " é o vencedor!!!");
                    }
                    else if(vencedor2 == 1){
                        System.out.println("\n\n" + carTwo.motorista + ", placa: " + carTwo.placa + " é o vencedor!!!");
                    }
                    
                    break;
                    
                case 4:
                    //Carro 1
                    double gas = carOne.checkCombustivel(); //metodo não necessário por hora
                    System.out.println(carOne.motorista);
                    System.out.println("Combustivel: " + gas);
                    
                    //Carro 2
                    gas = carTwo.checkCombustivel();
                    System.out.println(carTwo.motorista);
                    System.out.println("Combustivel: " + gas);
                    
                    break;
                    
                case 5:
                    //Carro 1
                    double litros = rand.nextDouble() + 10;
                    result = carOne.abastecer(litros);
                    System.out.println(carOne.motorista);
                    if(result == Carro.MOVEU){
                        System.out.println("Novo combustivel: " + carOne.combustivelDisponivel);
                    }
                    else{
                        System.out.println("Falha ao abastecer");
                    }
                    
                    //Carro 2
                    litros = rand.nextDouble() + 10;
                    result = carTwo.abastecer(litros);
                    System.out.println(carTwo.motorista);
                    if(result == Carro.MOVEU){
                        System.out.println("Novo combustivel: " + carTwo.combustivelDisponivel);
                    }
                    else{
                        System.out.println("Falha ao abastecer");
                    }
                    break;
                    
                case 6:
                    System.out.println("Até a próxima!!!");
                    break;
                
            }
        }
        
    }
    
    public final static void clearConsole(){
        for(int i=0;i<10;i++){
            System.out.println("\n");
        }
    }
    
    
}
