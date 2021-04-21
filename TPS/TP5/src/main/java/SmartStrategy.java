import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.Object;

public class SmartStrategy implements OrderingStrategy{
    List<Order> orders;
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) bar.order(drink,recipe);
        else {
            Order order = new Order(drink, recipe);
            orders.add(order);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(Order order: orders)
            bar.order(order.getDrink(),order.getRecipe());
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }

    public SmartStrategy() {
        this.orders = new ArrayList<>();
    }
}
