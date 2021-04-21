public class AreaStringOutputter {
    private SumProvider sumprovider;

    public AreaStringOutputter( SumProvider sumprovide) {
        this.sumprovider = sumprovide;
    }

    public String output() {
        return "Sum of areas: " + sumprovider.sum();
    }
}
