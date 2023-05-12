1--call the run()method more than one time
public class RunExp3 extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[])  
    {    S
        RunExp3 t1=new RunExp3();    
        RunExp3 t2=new RunExp3();    
        t1.run();    
        t2.run();    
    }
}2--

public class SleepExp1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        SleepExp1 t1 = new SleepExp1();
        SleepExp1 t2 = new SleepExp1();
        t1.start();
        t2.start();
    }}3--when

    sleep time
    is negative

    public class SleepExp2 extends Thread {
        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep(-500); // sleep time is negative
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }

        public static void main(String args[]) {
            SleepExp2 t1 = new SleepExp2();
            SleepExp2 t2 = new SleepExp2();
            t1.start();
            t2.start();
        }
    }4--

    public class CurrentThreadExp extends Thread {
        public void run() {
            // print currently executing thread
            System.out.println(Thread.currentThread().getName());
        }

        public static void main(String args[]) {
            // creating two thread
            CurrentThreadExp t1 = new CurrentThreadExp();
            CurrentThreadExp t2 = new CurrentThreadExp();
            // this will call the run() method
            t1.start();
            t2.start();
        }
    }5--

    public class JoinExample1 extends Thread {
        public void run() {
            for (int i = 1; i <= 4; i++) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }

        public static void main(String args[]) {
            // creating three threads
            JoinExample1 t1 = new JoinExample1();
            JoinExample1 t2 = new JoinExample1();
            JoinExample1 t3 = new JoinExample1();
            // thread t1 starts
            t1.start();
            // starts second thread when first thread t1 is died.
            try {
                t1.join();
            } catch (Exception e) {
                System.out.println(e);
            }
            // start t2 and t3 thread
            t2.start();
            t3.start();
        }
    }6--

    public class JoinExample2 extends Thread {
    public void run()  
    {    
        for(int i=1; i<=5; i++)  
        {    
            try  
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }

    public static void main(String args[])  
    {    
        // creating three threads  
        JoinExample2 t1 = new JoinExample2();    
        JoinExample2 t2 = new JoinExample2();    
        JoinExample2 t3 = new JoinExample2();    
        // thread t1 starts  
        t1.start();  
        // starts second thread when first thread t1 is died.  
        try  
        {    
            t1.join(1500);    
        }catch(Exception e){System.out.println(e);}    
        // start t2 and t3 thread   
        t2.start();   
        t3.start();