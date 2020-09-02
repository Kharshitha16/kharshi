/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class CUSTOMER {
    
public static void main(String[] args) {
        supermarket obj1=new supermarket();
        obj1.calculatebill();
        obj1.display();
        restaurent obj2=new restaurent();
        obj2.calculatebill();
        obj2.display();
        
    }
}
interface printable{
 public void calculatebill();
 public void display();
}
class supermarket implements printable{
    double amount,bill;
    double gst;
    Scanner obj=new Scanner(System.in);
    public void calculatebill(){
        System.out.println("Enter cost");
        amount=obj.nextInt();
        gst=(float)18/100*amount;
        bill=amount+gst;
   }
    public void display(){
        System.out.println("Total bill amount is : "+bill);
   }
}
class restaurent implements printable{
   double amount,bill;
    double gst;
    Scanner obj=new Scanner(System.in);
    public void calculatebill(){
        System.out.println("Enter cost");
        amount=obj.nextInt();
        gst=(float)5/100*amount;
        bill=amount+gst;
   }
    public void display(){
        System.out.println("Total bill amount is : "+bill);
   } 
}
