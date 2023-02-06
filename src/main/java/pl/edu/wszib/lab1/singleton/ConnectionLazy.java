package pl.edu.wszib.lab1.singleton;

public final class ConnectionLazy {

  private static ConnectionLazy INSTANCE;

  private ConnectionLazy() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
//brak pewnosci czy zostanie utworzona jedna instancja,
// nie jest zapewniona obsługa jednowątkowa
  //synchronized zapewnia zakolejkowanie sie watkow
  public synchronized static ConnectionLazy getInstance(){
    if(INSTANCE == null){
      INSTANCE = new ConnectionLazy();
    }
  return INSTANCE;
  }
}

