//package Threading;
import java.util.*;
 class ThreadP extends Thread {
    public void run() {
        System.out.println("thread is running");
    }
}
public class StartMethod {
    public static void main(String[] args) {
    ThreadP s1 = new ThreadP();
        s1.start();
    }
}
