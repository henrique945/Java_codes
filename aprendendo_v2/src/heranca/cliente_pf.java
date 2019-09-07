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
public class cliente_pf extends cliente{
    
    String cpf;
    
    public cliente_pf(String nome, String end, String cpf){
        super(nome,end);
        this.cpf = cpf;
    }
    
    public String getcpf(){
        return cpf;
    }
    
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    
}
