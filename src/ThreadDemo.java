/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author kimlee
 */
public class ThreadDemo {
    
    public static void main(String[] args) {
        TaskThread t1 = new TaskThread("ASSIGNMENT");
        t1.start();//start to run the task
        
        Task test = new Task("CLASS TEST");
        //Thread
        Thread worker = new Thread(test);
        worker.start();
    }
    
}
//FIRST METHOD
class TaskThread extends Thread{

    String name;

    public TaskThread(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("TASK: " + name + " IS RUNNING...");
    }
    
}

//SECOND METHOD
class Task implements Runnable{

    String name;

    public Task(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("TASK: " + name + " IS NOW RUNNING...");
    }
    
}