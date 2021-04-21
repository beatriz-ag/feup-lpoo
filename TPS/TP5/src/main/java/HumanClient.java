public class HumanClient implements Client{
    OrderingStrategy smartStrategy;
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        smartStrategy.wants(drink,recipe,bar);

    }

    @Override
    public void happyHourStarted(Bar bar) {
        smartStrategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {

    }

    public HumanClient(OrderingStrategy strategy) {
       smartStrategy = strategy;
    }
}
