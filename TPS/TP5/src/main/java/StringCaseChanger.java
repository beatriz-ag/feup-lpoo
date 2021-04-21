public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuilder newDrink = new StringBuilder(drink.getText());
        String drinkText = drink.getText();
        for(int i = 0; i < drinkText.length(); i++){
            char ch = drinkText.charAt(i);
            if (Character.isLowerCase(ch)){
                newDrink.setCharAt(i,Character.toUpperCase(ch));
            }
            else
                newDrink.setCharAt(i,Character.toLowerCase(ch));
        }
        drink.setText(newDrink.toString());
    }
    public void undo(StringDrink drink){
        StringBuilder newDrink = new StringBuilder(drink.getText());
        String drinkText = drink.getText();
        for(int i = 0; i < drinkText.length(); i++){
            char ch = drinkText.charAt(i);
            if (Character.isLowerCase(ch)){
                newDrink.setCharAt(i,Character.toUpperCase(ch));
            }
            else
                newDrink.setCharAt(i,Character.toLowerCase(ch));
        }
        drink.setText(newDrink.toString());
    }
}
