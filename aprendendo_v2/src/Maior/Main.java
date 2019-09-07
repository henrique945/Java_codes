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
public class Main {
    static int a = 8, b = 4;
    
    public static void main(String[] args) {
        Bigger num = new Bigger(a,b);
        
        System.out.print(num.geta() + " e " + num.getb() + " = ");
        
        num.set_ab(a,b);
        
        System.out.println(num.geta() + " e " + num.getb());
        
    }
    
    
}
