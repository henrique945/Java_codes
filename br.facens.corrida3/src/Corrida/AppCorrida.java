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
        
        //Carro 1
        System.out.println("Digite a velocidade atual do primeiro carro: ");
        carOne.setVelocidadeAtual(Double.parseDouble(scan.next()));
        System.out.println("Digite o combustivel atual do primeiro carro: ");
        carOne.setCombustivelDisponivel(Double.parseDouble(scan.next()));
        System.out.println("Digite o consumo do primeiro carro: ");
        carOne.setConsumo(Double.parseDouble(scan.next()));
        
        //Carro 2
        System.out.println("Digite a velocidade atual do segundo carro: ");
        carTwo.setVelocidadeAtual(Double.parseDouble(scan.next()));
        System.out.println("Digite o combustivel atual do segundo carro: ");
        carTwo.setCombustivelDisponivel(Double.parseDouble(scan.next()));
        System.out.println("Digite o consumo do segundo carro: ");
        carTwo.setConsumo(Double.parseDouble(scan.next()));
        
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
                    double velocidade = (rand.nextDouble()*10) + 10;
                    result = carOne.acelerar(velocidade); //metros
                    System.out.println(carOne.getMotorista());
                    if(result == Carro.MOVEU){
                        System.out.println("Nova velocidade atual: " + carOne.getVelocidadeAtual());
                    }
                    else{
                        System.out.println("Aceleração falhou!");
                    }

                    //Carro2
                    velocidade = (rand.nextDouble()*10) + 10;
                    result = carTwo.acelerar(velocidade); //metros
                    System.out.println(carTwo.getMotorista());
                    if(result == Carro.MOVEU){
                        System.out.println("Nova velocidade atual: " + carTwo.getVelocidadeAtual());
                    }
                    else{
                        System.out.println("Aceleração falhou!");
                    }
                    
                    break;
                    
                case 2:
                    //Carro 1
                    double freio = (rand.nextDouble()*10) + 10;
                    result = carOne.frear(freio);
                    System.out.println(carOne.getMotorista());
                    if(result == Carro.MOVEU){
                        System.out.println("Velocidade atual: " + carOne.getVelocidadeAtual());
                    }
                    else{
                        System.out.println("Frenagem falhou");
                    }
                    
                    //Carro 2
                    freio = (rand.nextDouble()*10) + 10;
                    result = carTwo.frear(freio);
                    System.out.println(carTwo.getMotorista());
                    if(result == Carro.MOVEU){
                        System.out.println("Velocidade atual: " + carTwo.getVelocidadeAtual());
                    }
                    else{
                        System.out.println("Frenagem falhou");
                    }
                    
                    break;
                    
                case 3:
                    //Carro 1
                    double time = rand.nextDouble();
                    result = carOne.mover(time); //segundos
                    boolean vencedor1 = false;
                    if(carOne.getDistanciaPercorrida() > distanciaTotal){
                        vencedor1 = true;
                    }
                    System.out.println(carOne.getMotorista());
                    
                    if(vencedor1 == true){
                        System.out.println("Tempo de " + carOne.getTempoAcumulado());
                        opt = 6;
                    }
                    else if(result == Carro.MOVEU){
                        System.out.println("Atual distancia percorrida: " + carOne.getDistanciaPercorrida());
                    }
                    else{
                        System.out.println("Movimento falhou!");
                    }
                    
                    //Carro 2
                    time = rand.nextDouble();
                    result = carTwo.mover(time); //segundos
                    boolean vencedor2 = false;
                    if(carTwo.getDistanciaPercorrida() > distanciaTotal){
                        vencedor2 = true;
                    }
                    System.out.println(carTwo.getMotorista());
                    
                    if(vencedor2 == true){
                        System.out.println("Tempo de " + carTwo.getTempoAcumulado());
                        opt = 6;
                    }
                    else if(result == Carro.MOVEU){
                        System.out.println("Atual distancia percorrida: " + carTwo.getDistanciaPercorrida());
                    }
                    else{
                        System.out.println("Movimento falhou!");
                    }
                    
                    //Vencedor
                    if(vencedor1 == true && vencedor2 == true){
                        if(carOne.getTempoAcumulado() < carTwo.getTempoAcumulado()){
                          System.out.println("\n\n" + carOne.getMotorista() + ", placa: " + carOne.getPlaca() + " é o vencedor!!!");
                        }
                        else{
                          System.out.println("\n\n" + carTwo.getMotorista() + ", placa: " + carTwo.getPlaca() + " é o vencedor!!!");
                        }
                    }
                    else if(vencedor1 == true){
                        System.out.println("\n\n" + carOne.getMotorista() + ", placa: " + carOne.getPlaca() + " é o vencedor!!!");
                    }
                    else if(vencedor2 == true){
                        System.out.println("\n\n" + carTwo.getMotorista() + ", placa: " + carTwo.getPlaca() + " é o vencedor!!!");
                    }
                    
                    break;
                    
                case 4:
                    //Carro 1
                    double gas = carOne.checkCombustivel(); //metodo não necessário por hora
                    System.out.println(carOne.getMotorista());
                    System.out.println("Combustivel: " + gas);
                    
                    //Carro 2
                    gas = carTwo.checkCombustivel();
                    System.out.println(carTwo.getMotorista());
                    System.out.println("Combustivel: " + gas);
                    
                    break;
                    
                case 5:
                    //Carro 1
                    double litros = (rand.nextDouble()*10) + 10;
                    result = carOne.abastecer(litros);
                    System.out.println(carOne.getMotorista());
                    if(result == Carro.MOVEU){
                        System.out.println("Novo combustivel: " + carOne.getCombustivelDisponivel());
                    }
                    else{
                        System.out.println("Falha ao abastecer");
                    }
                    
                    //Carro 2
                    litros = (rand.nextDouble()*10) + 10;
                    result = carTwo.abastecer(litros);
                    System.out.println(carTwo.getMotorista());
                    if(result == Carro.MOVEU){
                        System.out.println("Novo combustivel: " + carTwo.getCombustivelDisponivel());
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
