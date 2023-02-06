package pl.edu.wszib.lab1.singleton;

import java.sql.Connection;

public final class ConnectionLazy {

  private static ConnectionLazy INSTANCE;

  private ConnectionLazy() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
  // synchronized - kazde wywolanie metody bedzie powodowalo wywolanie synchronized!
  //wszystkie watki beda sie kolejkowaly na wywolaniu tej metody, wydajosc kiepska
  //double check locking - lepsze podejście
  public  static ConnectionLazy getInstance(){

    if(INSTANCE == null){
      synchronized(ConnectionLazy.class){
        if(INSTANCE == null){
          INSTANCE = new ConnectionLazy();
        }
      }
    }
  return INSTANCE;
  }
}

