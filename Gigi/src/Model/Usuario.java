/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Henrique
 */
public class Usuario extends Pessoa{
    private String senha;
    private String nivelAcesso;

    public Usuario(String senha, String nivelAcesso, int id, String nome) {
        super(id, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getNivelAcesso(){
        return senha;
    }
    
    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }
    
    
    
    
}
