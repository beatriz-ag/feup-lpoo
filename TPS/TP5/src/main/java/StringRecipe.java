import java.util.List;

public class StringRecipe {
    List<StringTransformer> list;

    public StringRecipe(List<StringTransformer> list) {
        this.list = list;
    }
    public void mix(StringDrink drink){
        for(StringTransformer changer: list){
            changer.execute(drink);
        }
    }

}
