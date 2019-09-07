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
public class cliente_pj extends cliente{
    
    private String cnpj;
    
    public cliente_pj(String nome,String end,String cnpj){
        super(nome,end);
        this.cnpj = cnpj;
    }
    
    public String getcnpj(){
        return cnpj;
    }
    
    public void setcnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    
    
}
