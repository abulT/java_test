public class Graphicscard {
    protected String brand;
    protected String series;

    public Graphicscard() {
        this.brand = " NVIDIA";
        this.series = "3050";
    }

    public Graphicscard(String brand, String series) {
        this.brand = brand;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Graphicscard [brand=" + brand + ", series=" + series + "]";
    }


       
}
