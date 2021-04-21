import java.util.*;

public class Application {
    public static void main(String[] args) {

        AreaAggregator aggregator = new AreaAggregator();

        aggregator.addAreaShape(new Square(10));
        aggregator.addAreaShape(new Circle(5));
        aggregator.addAreaShape(new Circle(2));
        aggregator.addAreaShape(new Ellipse(2, 3));
        aggregator.addAreaShape(new Rectangle(10, 5));
        aggregator.addAreaShape(new Triangle(10, 2));
        aggregator.addAreaShape(new House(100));

        AreaStringOutputter stringOutputter = new AreaStringOutputter(aggregator);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(aggregator);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());

        List<House> houses = new ArrayList<>();
        houses.add(new House(50));
        houses.add(new House(150));

        City city = new City(houses);

        AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
        AreaXMLOutputter cityXmlOutputter = new AreaXMLOutputter(city);

        System.out.println(cityStringOutputter.output());
        System.out.println(cityXmlOutputter.output());
    }
}
