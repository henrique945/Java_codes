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
    
    //private
    private String motorista;
    private String placa;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private double consumo;
    private double capacidadeTanque;
    private double combustivelDisponivel;
    private double distanciaPercorrida;
    private double tempoAcumulado;
    
    //nao existe velocidade negativa ou acima da maximna
    //nao existe combustivel netago ou acima do total
    //consumo fixo, independente da velocidade
    
    //Construtores
    public Carro(String motorista, String placa, double velocidadeMaxima, double consumo, double capacidadeTanque){
        this.motorista = motorista;
        this.placa = placa;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public Carro(){
        System.out.println("Carro criado com sucesso!");
    }

    //Getters and setters
    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getConsumo() {
        return consumo;
    }
    
    public void setConsumo(double consumo){
        this.consumo = consumo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getCombustivelDisponivel() {
        return combustivelDisponivel;
    }
    
    public void setCombustivelDisponivel(double combustivel){
        this.combustivelDisponivel = combustivel;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public double getTempoAcumulado() {
        return tempoAcumulado;
    }
    
    //Metódos
    public int acelerar(double aumentoVelocidade){
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
    
    //tempo aleatorio para mover o carro
    //distancia total individual de cada corrida
    public int mover(double tempo){
        //consumo por segundo
        if(tempo < 0){
            return TEMPO_NEGATIVO;
        }
        else if(combustivelDisponivel - (consumo * tempo) < 0){
            return GAS_INDISPONIVEL;
        }
        else{
            tempoAcumulado += tempo; 
            
            double dist = velocidadeAtual * tempo;
            distanciaPercorrida += dist;
            
            combustivelDisponivel -= consumo * tempo; 
            
            return MOVEU;
        }
    }
    
    
    public int frear(double diminuiVelocidade){
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
    
    public double checkCombustivel(){
        return combustivelDisponivel;
    }
    
    public int abastecer(double gasolina){
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
