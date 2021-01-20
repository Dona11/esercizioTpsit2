/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class NumberHelper {
    
    private int number;

    public NumberHelper(int number) {
        this.number = number;
    }
    
    public boolean isEven(){
    
        if(number % 2 == 0){
        
            return true;
        }else{
        
            return false;
        }
    }
    
    public boolean isOdd(){
    
        if(number % 2 == 0){
        
            return false;
        }else{
        
            return true;
        }
    }
    
    public int sum(int n){
    
        return n + number;
    }
    
    public boolean isPrime(){
    
        for(int i = number - 1; i > 1; i--){
        
            if(number % i == 0){
            
                return false;
            }
        }
        
        if(number == 0)
            return false;
        else
            return true;
    }
    
    public boolean isDivisibleBy(int n){
    
        if(n == 0){
        
            return false;
        }
        
        if(number % n == 0){
        
            return true;
        }else
            return false;
        
    }
}
