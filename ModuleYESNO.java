/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduleyesno;

import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class ModuleYESNO {

     
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if(n%2==0){
            if(n<=2){     
            System.out.println("NO");
            }else{
            System.out.println("YES");
            }
        }else{
          System.out.println("NO");
        }
        
        
    }
    
}
    

