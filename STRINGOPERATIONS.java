/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author admin
 */
public class STRINGOPERATIONS {
 public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int p=0,pos=0;
        System.out.println(" search a given word in array ");
        String[] s=new String[]{"anu,rani,jeya,kharshi,aishu"};
        System.out.println("Enter the string to be searched");
        String r=obj.nextLine();
        
        for(int i=0;i<5;i++){
         if(s[i].equals(r)){
             p++;
             pos=i;
             break;
            }
        }
        if(p==0){
         System.out.println("the string you searched is not found ");
        }
        else{
         System.out.println("the  string you searched is found at position "+pos);
        }
        System.out.println("printing all elements in the array starting & ending with the letter given");
        System.out.println("Enter the starting letter");
        char first=obj.next().charAt(0);
        System.out.println("Enter the ending letter");
        char last=obj.next().charAt(0);
        for(int i=0;i<5;i++){
           String a1=s[i];
           int n=s[i].length();
           char first1=a1.charAt(0);
           char last1=a1.charAt(n-1);
           if(first==first1 && last==last1){
               System.out.println(a1); 
            }
           else{
              continue;
           }
}
}}
    
            

