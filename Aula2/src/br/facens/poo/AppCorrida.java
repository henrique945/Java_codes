/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.facens.poo;

/**
 *
 * @author 190898
 */
public class AppCorrida {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        
        c1.placa = "JDK-1234";
        c1.valor = 456.78;
        c2.placa = "IMC-9988";
        c2.valor = 111.23;
        
        System.out.println("Carro 1: " + c1.placa);  //c1 -> variavel // placa -> atributo
        System.out.println("Valor 1: " + c1.valor);
        System.out.println("Carro 2: " + c2.placa);
        System.out.println("Valor 2: " + c2.valor);
        
        //exception NullPointException -> erro quando estamos tentando acessar algo que não existe
        //exemplo: tentar acessar um atributo de um objeto que nao existe
        
        String nome = "FACENS"; //criou um objeto sem a palavra new (excessão)
        System.out.println("\n" + nome);
        nome = nome.toLowerCase();
        System.out.println(nome);
        
        
    }
}
