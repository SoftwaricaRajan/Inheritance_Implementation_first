/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceimplementationfirst;
import java.util.Scanner;
/**
 *
 * @author MomentumSubash
 */
class multiply extends Sum implements subtract{

    public int mul(int a, int b){
    return a*b;
    }
}
public class InheritanceImplementationFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a first no: and second no respectively ");
        
        
        int a = reader.nextInt();
        int b = reader.nextInt();
        multiply m1 = new multiply();
        System.out.println("our multiplication is::"+m1.mul(a, b));
        System.out.println("our addition is::"+m1.add(a, b));
        System.out.println("our subtraction is::"+m1.sub(a, b));
    }
    
}
