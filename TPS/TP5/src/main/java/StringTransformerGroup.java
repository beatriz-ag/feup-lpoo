import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> list;

    public StringTransformerGroup(List<StringTransformer> list) {
        this.list = list;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer changer: list){
            changer.execute(drink);
        }
    }
}
