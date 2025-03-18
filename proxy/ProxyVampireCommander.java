package proxy;

public class ProxyVampireCommander implements VampireCommander{
    private RealVampireCommander realCommander;

    public ProxyVampireCommander(RealVampireCommander realCommander) {
        this.realCommander = realCommander;
    }

    public void giveOrder(String order) {
        if (isNightTime()) {
            realCommander.giveOrder(order);
        } else {
            System.out.println("🌞 Зараз день! Вампіри не можуть діяти.");
        }
    }

    private boolean isNightTime() {
        // Для простоти, вважаємо, що вампіри активні після 18:00 (реалізуй за потреби)
        int hour = java.time.LocalTime.now().getHour();
        return hour >= 18 || hour < 6;
    }
}
