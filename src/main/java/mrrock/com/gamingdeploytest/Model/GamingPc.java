package mrrock.com.gamingdeploytest.Model;



public class GamingPc {
    private String name;
    private String GPU;
    private double price;

    public GamingPc() {
    }

    public GamingPc(String name, double price, String GPU) {
        this.name = name;
        this.price = price;
        this.GPU = GPU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
