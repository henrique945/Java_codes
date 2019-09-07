/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Change;

/**
 *
 * @author 190898
 */
public class Main {

    public static void main(String[] args) {
        Troca t1 = new Troca(1,2);
        
        System.out.print(t1.geta() + " e " + t1.getb() + " = ");
        
        t1.set(1,2);
        
        System.out.println(t1.geta() + " e " + t1.getb());
    }
 
    
    
}
