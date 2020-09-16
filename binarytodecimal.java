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
public class binarytodecimal {
    
 public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int  binary,binaryf, f = 1,sumn=0;
        double sum=0;
        System.out.println("ENTER A BINARY STRING");
        String a = obj.nextLine();
        binary=Integer.parseInt(a);
        binaryf = binary;
        while (binaryf != 0) {
            int n = binaryf % 10;
            if (n > 1) {
                f = 0;
                break;
            } else {
                binaryf = binaryf / 10;
            }
        }
        if (f== 0) {
            System.out.println("IT IS AN INVALID BINARY STRING" + binary);
        } else {
            for(int i=0;i<4;i++){
            int m=binary%10;
            sum=sum+m*Math.pow(2,i);
            sumn=(int)sum;
            binary=binary/10;
            }
            System.out.println("The equivalent decimal number for binary " + a + " is: "+sumn);
        }

    }

}

