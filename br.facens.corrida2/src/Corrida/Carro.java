/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corrida;

/**
 *
 * @author 190898
 */
public class Carro {
    public static final int MOVEU                      = 0;
    public static final int VELOCIDADE_NEGATIVA        = 1;
    public static final int VELOCIDADE_MAXIMA_ATINGIDA = 2;
    public static final int TEMPO_NEGATIVO             = 3;
    public static final int VELOCIDADE_MINIMA_ATINGIDA = 4;
    public static final int GAS_INDISPONIVEL           = 5;
    public static final int VENCEDOR                   = 6;
    
    String motorista;
    String placa;
    double velocidadeAtual;
    double velocidadeMaxima;
    double consumo;
    double capacidadeTanque;
    double combustivelDisponivel;
    double distanciaPercorrida;
    double tempoAcumulado;
    
    //nao existe velocidade negativa ou acima da maximna
    //nao existe combustivel netago ou acima do total
    //consumo fixo, independente da velocidade
    public Carro(String motorista, String placa, double velocidadeMaxima, double consumo, double capacidadeTanque){
        this.motorista = motorista;
        this.placa = placa;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    
    int acelerar(double aumentoVelocidade){
        if(velocidadeAtual + aumentoVelocidade > velocidadeMaxima){
            return VELOCIDADE_MAXIMA_ATINGIDA;
        }
        else if(aumentoVelocidade < 0){
            return VELOCIDADE_NEGATIVA;
        }
        else{
            velocidadeAtual += aumentoVelocidade;
            return MOVEU;
        }
    }
    
    
    int mover(double tempo, double gas, double gastoGas, double distancia){
        //consumo por segundo
        if(tempo < 0){
            return TEMPO_NEGATIVO;
        }
        else if(gas - (gastoGas * tempo) < 0){
            return GAS_INDISPONIVEL;
        }
        else{
            tempoAcumulado += tempo; 
            
            double dist = velocidadeAtual * tempo;
            distanciaPercorrida += dist;
            
            gas -= gastoGas * tempo; 
            combustivelDisponivel = gas;
            
            if(distanciaPercorrida > distancia){
                return VENCEDOR;
            }
            else{
                return MOVEU;
            }
            
        }
    }
    
    int frear(double diminuiVelocidade){
        if(diminuiVelocidade < 0){
            return VELOCIDADE_NEGATIVA;
        }
        else if(velocidadeAtual - diminuiVelocidade < 0){
            return VELOCIDADE_MINIMA_ATINGIDA;
        }
        else{
            velocidadeAtual -= diminuiVelocidade;
            return MOVEU;
        }
    }
    
    double checkCombustivel(){
        return combustivelDisponivel;
    }
    
    int abastecer(double gasolina){
        if(gasolina < 0){
            return VELOCIDADE_NEGATIVA;
        }
        else if(combustivelDisponivel + gasolina > capacidadeTanque){
            combustivelDisponivel = capacidadeTanque;
            return MOVEU;
        }
        else{
            combustivelDisponivel += gasolina;
            return MOVEU;
        }
    }
    
    
    //checar 2 vezes por turno se ha vencedor
    
    
}
