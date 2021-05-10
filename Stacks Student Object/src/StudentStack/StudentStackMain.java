/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentStack;

/**
 *
 * @author Ryan Kolbe
 */
public class StudentStackMain {
    
    public static void main(String[] args){
        
    StudentStack studentStack = new StudentStack();
    
    studentStack.push(new Student("Ryan Kolbe", "8307265292087", "Male", "Applications Development"));
    studentStack.push(new Student("Dimitri Johannes", "8307265292087", "Male", "Applications Development"));
    studentStack.push(new Student("Dimitri Ferus", "8307265292087", "Male", "Applications Development"));
    
    System.out.println(studentStack.pop().toString());
    System.out.println(studentStack.pop().toString());
    
    System.out.println(studentStack.peek().toString());
    System.out.println(studentStack.isEmpty());
    }
}