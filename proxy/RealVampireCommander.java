package proxy;

public class RealVampireCommander implements VampireCommander {
    public void giveOrder(String order) {
        System.out.println("Вампірський командир віддає наказ: " + order);
    }
}
