/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author admin
 */
public class EMPLOYEESALARY {
 public static void main(String[] args) {
        
 Employee e1[]=new Employee[5];
        ArrayList<Employee> list=new ArrayList<>();
        
        for(int i=0;i<5;i++){
          e1[i]=new Employee();
          e1[i].getdata();
            System.out.println(e1[i]);
        }
        for(int j=0;j<5;j++){
           list.add(e1[j]);
        }
        System.out.println("Information of 20 employees");
        System.out.println(list);
        System.out.println("list after sorting the salary in ascending order");
        Collections.sort(list,new salarysort());
        System.out.println(list);
    }
    
}
class Employee{
 String name;
 double salary;
 void getdata(){
   Scanner obj=new Scanner(System.in);
     System.out.println("Enter name");
     name=obj.nextLine();
     System.out.println("Enter salary");
     salary=obj.nextDouble();
 }
 @Override
 public String toString(){
    return "Name="+name+" salary="+salary;
 }
}
class salarysort implements Comparator<Employee>{
   @Override
   public int compare(Employee e1,Employee e2){
         return (int)(e1.salary-e2.salary);
   }
}      