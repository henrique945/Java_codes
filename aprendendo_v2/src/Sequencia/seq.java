/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequencia;

/**
 *
 * @author 190898
 */
public class seq {
    int num;
    int i;
    
    public seq(int num){
        this.num = num;
    }
    
    public void transf(int num){
        for(i=num;i>=0;i--){
            System.out.println(i); 
       }
    }

}
