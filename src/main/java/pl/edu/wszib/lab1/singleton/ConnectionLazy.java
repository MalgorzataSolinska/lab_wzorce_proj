package pl.edu.wszib.lab1.singleton;

public final class ConnectionLazy {

  private static ConnectionLazy INSTANCE;

  private ConnectionLazy() {
  }
//brak pewnosci czy zostanie utworzona jedna instancja, nie jest zapewniona obsługa jednowątkowa
  public static ConnectionLazy getInstance(){
    if(INSTANCE == null){
      INSTANCE = new ConnectionLazy();
    }
  return INSTANCE;
  }
}

