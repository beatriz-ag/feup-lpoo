

public class StringBar extends Bar{
    boolean happyHour = false;

    public StringBar() {
        super();
    }

    public boolean isHappyHour(){
        return happyHour;
    };

    public void startHappyHour(){
        happyHour = true;
        notifyObservers();
    };
    public void endHappyHour(){
        happyHour = false;
        notifyObservers();
    };

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);

    }
}
