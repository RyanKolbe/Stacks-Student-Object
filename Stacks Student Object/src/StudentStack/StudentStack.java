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
public class StudentStack {
    
    private final Student[] data;
    private int top;

    public StudentStack() {
        this.data = new Student[5];
        this.top = -1;
    }
    
    public void push(Student student){
        top ++;
        data[top] = student;
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public Student peek(){
        return data[top];
    }
        
    public Student pop(){
        Student popped = data[top];
        top --;
        return popped;
    }  
}
