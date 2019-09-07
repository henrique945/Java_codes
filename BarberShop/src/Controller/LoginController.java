/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Henrique
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
        
    public void entrarNoSistema(){
        
        //pegar um usuario da View
        Usuario usuario = helper.obterModelo();
        
          
        //pesquisar o usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutentica = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutentica != null){
            //navegar para o MenuPrincipal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }
        else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        //se o usuario da View tiver mesmo usuario e senha que o usuario vindo do Banco direcionar, redirecionar para o menu principal
        //se nao, vou mostrar uma mensagem ao usuario "usuario ou senha invalidos"
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
        
    
    
    
    
    
    
    
    
}
