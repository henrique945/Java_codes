/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author 190898
 */
public class clienteApp {
    
    public static void main(String[] args) {
        cliente_pf PessoaFisica1 = new cliente_pf("Henrique","R. Humaita","190898");
        
        System.out.println("Cliente: " + PessoaFisica1.getNome() + ", " + PessoaFisica1.getEnd() + " - " + PessoaFisica1.getcpf());
        
        
        
    }
    
}
