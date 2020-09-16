/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class emailid {
    
 public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String FN;
        String LN;
        System.out.println("ENTER FIRST NAME");
        FN=obj.nextLine();
        System.out.println("ENTER LAST NAME");
        LN=obj.nextLine();
        String Lname=LN.substring(0, 4);
        String Fname=FN.substring(0, 3);
        String a=Fname.concat(".");
        String b=a.concat(Lname);
        String emailid=b.concat("@gmail.com");
        System.out.println("emailid= "+emailid);
        
        
    }
    
}

