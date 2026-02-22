package com.example.oppsconcept.multithreading.ThreadLifecycle1;

public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        //New State
        System.out.println(t1.getState()); //New

        //Runnable State
        t1.start();
        System.out.println(t1.getState()); //Runnable

        // THERE IS no Running State //
        System.out.println(Thread.currentThread().getState()); // still runnable cuz there is no running at enum class

        //Thread to catch Time waiting by using try catch in override method
        Thread.sleep(180);
        System.out.println(t1.getState());

        // Terminate the Thread and moved to new state.
        t1.join();
        System.out.println(t1.getState());

    }
}
