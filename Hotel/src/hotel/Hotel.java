/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Henrique
 */
public class Hotel {

    public static void main(String[] args) {
       Cadastra hosp1 = new Cadastra("Henrique",21);
       
       System.out.println("Cadastro do hotel"); 
       System.out.println("H1: " + hosp1.getNome() + "  Idade: " + hosp1.getIdade());
       
       hosp1.setNome("Amanda");
       hosp1.setIdade(20);
       
       System.out.println("Cadastro do hotel atualizado"); 
       System.out.println("H1: " + hosp1.getNome() + "  Idade: " + hosp1.getIdade());
       
    }
    
}
