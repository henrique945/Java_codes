/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author Henrique
 */
public class function {
    public static void main(String[] args) {
        function exemplo = new function();
        exemplo.hi();
        exemplo.hello("Tony");
        
        int soma = exemplo.sum(2,3);
        System.out.println(soma);
    }
    
    private int sum(int a, int b){
        return a+b;
    }
    
    private void hi(){
        System.out.println("Ola");
    }
    
    private void hello(String name){
        System.out.println("Ola " + name + "!!");
    }
    
    
}
