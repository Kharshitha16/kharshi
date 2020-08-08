
package com.mycompany.worksheet1;

/**
 *
 * @author welcom
 */
public class test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        customer obj= new customer(101,"aaa",20);
        System.out.println(obj.getid());
        System.out.println(obj.getname());
        System.out.println(obj.getdiscount());
        obj.setdiscount(10);
        System.out.println(obj.getdiscount());
        System.out.println(obj);
    }}
    
    class customer{
    int id;
    String name;
    int discount;
    customer(int i, String n ,int d){
        id =i;
        name= n;
        discount=d;
    }
    int getid(){
        return id;
    }
    String getname(){
        return name;
    }
    int getdiscount(){
        return discount;
    }
    void setdiscount(int d1){
        discount=d1;
    }
    public String toString(){
        return id+""+name+""+discount;
    }
}
