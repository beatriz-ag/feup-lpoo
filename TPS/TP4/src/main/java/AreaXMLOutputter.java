public class AreaXMLOutputter {
    SumProvider sumprovider;

    public AreaXMLOutputter(SumProvider sumprovide) {
        this.sumprovider = sumprovide;
    }

    public String output() {
        return "<area>" + sumprovider.sum() +"</area>";
    }
}
