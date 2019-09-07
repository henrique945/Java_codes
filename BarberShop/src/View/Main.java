/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Henrique
 */
public class Main {
    
    public static void main(String[] args){
        
        String nome = "Henrique";
        System.out.println(nome);
        
        Servico servico = new Servico(1,"barba",30); 
        
        System.out.println(servico.getDecricao());
        System.out.println(servico.getValor());   
        
        Cliente cliente = new Cliente(1, "Henrique", "Rua humaitá", "327331");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "larisse5");
        System.out.println(usuario.getSenha());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "18/12/1997 09:14");
        System.out.println(agendamento.getCliente().getNome());
        
        
    }
    
    
    
    
}
