package pl.edu.wszib.lab1.singleton;

public final class ConnectionEager {
  private ConnectionEager() {
  }

  public final static ConnectionEager INSTANCE = new ConnectionEager();

  // implementacja wzorca singleton - jedna instancja klasy Connection w aplikacji
  // 2 sposoby:
  // 1.instancja jest tworzona w sposób zachłanny (EAGER) jedna instancja w klasie coonnection
  // prywatny konstruktor, klasa final,
  // 2. instancja jest tworzona dopiero przy pierwszej próbie użycia (LAZY)



}
