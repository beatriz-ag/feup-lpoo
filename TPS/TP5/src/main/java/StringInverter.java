public class StringInverter implements  StringTransformer{
    public void execute(StringDrink drink){
        StringBuilder stringBuilder = new StringBuilder().append(drink.getText());
        stringBuilder.reverse();
        drink.setText(stringBuilder.toString());
    }
    public void undo(StringDrink drink){
        StringBuilder stringBuilder = new StringBuilder().append(drink.getText());
        stringBuilder.reverse();
        drink.setText(stringBuilder.toString());
    }
    public StringInverter() {
    }
}
