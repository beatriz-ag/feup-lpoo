import java.util.*;

public class AreaAggregator implements SumProvider{
    private List<HasArea> shapes = new ArrayList<>();

    public void addAreaShape(HasArea shape) {
        shapes.add(shape);
    }

    public double sum() {
        double sum = 0;
        for (HasArea shape: shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}