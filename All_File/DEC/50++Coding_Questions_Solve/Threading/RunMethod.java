//package Threading;


class RunThread extends Thread{
    public void run() {
    System.out.println("Thread is Running");
}
}

public class RunMethod {
  public static void main(String[] args) {
      RunThread r1 = new RunThread();
      r1.run();
  }  
}
