package pl.edu.wszib.lab1.singleton;

import java.net.ConnectException;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

  static ConnectionLazy instance1;
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService.submit(new Runnable() {
                             @Override
                             public void run() {
                               instance1 = ConnectionLazy.getInstance();
                             }
    });
    ConnectionLazy instance = ConnectionLazy.getInstance();
  if(instance == instance1) {
    System.out.println(instance);
    System.out.println(instance1);
    System.out.println("Are the same");
  }else{
    System.out.println(instance);
    System.out.println(instance1);
    System.out.println("Instances are different");
  }
  }
}
