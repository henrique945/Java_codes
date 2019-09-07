/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendo_v2;

import java.awt.BorderLayout;

/**
 *
 * @author 190898
 */
public class Aprendendo_v2 {

    public static void main(String[] args) {
        
        pessoa p1 = new pessoa(1,"Henrique");
        pessoa p2 =  new pessoa(2,"Caio");
        
        System.out.println("Nome: " + p1.getNome());
        
        p1.setNome("Amanda");
        System.out.println("Novo nome: " +p1.getNome());
        
        
        System.out.println(p1.getInt() + " " + p2.getInt());
        
        p1.setInt(0); //somando mais um na classe pessoa
        
        
        System.out.println(p1.getInt());
        
    }
    
}
