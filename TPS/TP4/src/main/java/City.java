import java.util.*;
public class City implements SumProvider{
    private List<House> houses = new ArrayList<>();

    public void add(House house) {
        houses.add(house);
    }

    public City(List<House> houses) {
        this.houses = houses;
    }

    public double sum(){
        double sum = 0;

        for (House house: houses)
            sum += house.getArea();

        return sum;
    }
}
