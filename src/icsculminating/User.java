package icsculminating;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noohn
 */
public class User {
    //defining all of the attributes
    private String name;
    private int age;
    private static int total_users =0;
    
    
    //making the constructor
    public User(String name, int age){
        this.name = name;
        this.age = age;
        //incrementing total users by one each time new object instantiated
        total_users++;
    }
    
    //overloaded constructor
    public User(){
        name="";
        age=0;
        //incrementing total users by one each time new object instantiated
        total_users++;
    }//overloaded constructor
    
    //making getters and setters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
}
