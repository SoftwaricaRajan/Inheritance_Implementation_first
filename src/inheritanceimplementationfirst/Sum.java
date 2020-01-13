/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceimplementationfirst;

/**
 *
 * @author MomentumSubash
 */
interface Mixture extends subtract{
public int add(int x, int y);
public int sub(int  x, int y);
}
public class Sum extends Subtraction implements Mixture{
    
    public int add(int a,int b){
    return a+b;
    }
    
}
