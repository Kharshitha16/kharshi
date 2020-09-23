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
public class exceptionprogramone {
    
public static void main(String[] args)
{
        person obj1 = new person();//creating object for class person
        obj1.getdata(); //caling method getdata()
        //try block for user defined exception
        try {
            obj1.check();//caling method check()
            System.out.println("DETAIL:");
            obj1.display();//caling method printdata()
        } 
        //catch block for user defined exception
        catch (NameIncorrectFormatException e) {
            System.out.println(e);
        }

    }

}

class person {

    String name;
    int age;
    String mailid;
//method to get data from the user

    void getdata() {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER NAME:");
        name = obj.nextLine();
        System.out.println("ENTER AGE:");
        age = obj.nextInt();
        System.out.println("ENTER MAIL ID :");
        mailid = obj.next();
    }
//method to print the data if its crt

    void display() {
        System.out.println("NAME :" + name);
        System.out.println("AGE:" + age);
        System.out.println("MAIL ID :" + mailid);
    }

    void check() throws NameIncorrectFormatException {
        char[] arr = name.toCharArray();
        for (char n : arr) {
            //checking whether the name string contains spl char or digits 
            if (!(n >= 'a' && n <= 'z')) {
                throw new NameIncorrectFormatException("NAME IS INVLALID");
            }
        }
    }

}

class NameIncorrectFormatException extends Exception {

    String message;

    NameIncorrectFormatException(String msg) {
        super(msg);
    }

}


