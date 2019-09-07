/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImparPar;

/**
 *
 * @author 190898
 */
public class ImparPar {
    int num, i, mult = 1, sum = 0;
    
    public ImparPar(int num){
        this.num = num;
    }
    
    public void EvenOdd(int num){
        for(i=1;i<num;i++){
            if(i%2 == 0){
                mult *= i;
            }
            else{
               sum += i; 
            }
        }
        System.out.println("Pares = " + mult + "\nImpares = " + sum);
        
    }
    
    
}
