/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendo_v2;

/**
 *
 * @author 190898
 */
public class pessoa {
    private int codigo;
    private String nome;
    
    public pessoa(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getInt(){
        return codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setInt(int codigo){
        this.nome = nome+2;
    }
}
