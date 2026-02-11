public class Laptop{
    protected String RAM;
    protected String SSD;
    protected Processor processor;
    protected String screen;
    protected Graphicscard graphicscard;
    protected String performance;

    public Laptop() {
        this.RAM = "16 GB";
        this.SSD = "1 TB";
        this.graphicscard = new Graphicscard();
        this.performance = "Ver well";
        this.processor = new Processor();
        this.screen = "16.5 inch";
    }

    public Laptop(String RAM, String SSD, Graphicscard graphicscard, String performance, Processor processor, String screen) {
        this.RAM = RAM;
        this.SSD = SSD;
        this.graphicscard = graphicscard;
        this.performance = performance;
        this.processor = processor;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Laptop [RAM=" + RAM + ", SSD=" + SSD + ", processor=" + processor + ", screen=" + screen
                + ", graphicscard=" + graphicscard + ", performance=" + performance + "]";
    }
    

}