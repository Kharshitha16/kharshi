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
public class exceptionprogramtwo {
    
 public static void main(String[] args) {
 
 Scanner obj = new Scanner(System.in);
        // Try block for ArithmeticException
        try {
            System.out.println("ENTER NUMBER1");
            int a = obj.nextInt();
            System.out.println("ENTER NUMBER2");
            int b = obj.nextInt();
            int c = a / b; //cant do div if denominator is zero
            System.out.println(c);
        } 
        // Catch block for ArithmeticException
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        // Try block for NumberFormatException
        try {
            System.out.println("ENTER STRING str");
            String str = obj.next();
            int f = Integer.parseInt(str);//cant convert letters into integer
            System.out.println(f);
        }
        // Catch block for NumberFormatException
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        // Try block for ArrayIndexOutOfBoundsException
        try {
            System.out.println("ENTER POSITION OF ARRAY IN WHICH YOU WANT TO ENTER 9");
            int pos = obj.nextInt();
            int arr[] = new int[10];//can only accomodate 10 elements
            arr[pos] = 9;
            System.out.println(arr[pos]);
        } 
        // Catch block for ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        // Try block for StringIndexOutOfBoundsException
        try {
            System.out.println("ENTER STRING str1");
            String str1 = obj.next();
            System.out.print("LENGTH OF STRING`:");
            System.out.println(str1.length());//cant access char if given index is greater than length of string
            char c = str1.charAt(40);
            System.out.println(c);
        } 
        // Catch block for StringIndexOutOfBoundsException
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}