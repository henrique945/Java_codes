/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maior;

/**
 *
 * @author 190898
 */
public class Bigger {
    int a,b;
    
    public Bigger(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int geta(){
        return a;
    }
    
    public int getb(){
        return b;
    }
    
    public void set_ab(int a, int b){
        if(a > b){
            this.a = b;
            this.b = a;
        }
    }
    
}
