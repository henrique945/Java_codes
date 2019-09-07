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
public class cliente {
    private String nome;
    private String end;
    
    public cliente(String nome, String end){
        this.end = end;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEnd(){
        return end;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEnd(String end){
        this.end = end;
    }
    
}
