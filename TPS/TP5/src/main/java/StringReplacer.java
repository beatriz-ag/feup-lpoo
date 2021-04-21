public class StringReplacer implements StringTransformer{
    char a, x;
    public StringReplacer(char a, char x) {
        this.a = a;
        this.x = x;
    }

    @Override
    public void execute(StringDrink drink) {
        String newDrink = drink.getText().replace(a,x);
        drink.setText(newDrink);
    }

    public void undo(StringDrink drink){
        String newDrink = drink.getText().replace(x,a);
        drink.setText(newDrink);
    }
}
