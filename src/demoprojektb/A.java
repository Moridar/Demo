/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoprojektb;
import java.util.Scanner;
/**
 *
 * @author Computer
 */
public class A {

    public A(String text) {
        
        System.out.println(text);
    }
    

    public A() {
        
        System.out.println("Hvor gammel er du?: ");
        int sc = new Scanner(System.in).nextInt();
        System.out.println("Så er du " + sc + 40 + "om 40 år");
    }
    

    
    
}
