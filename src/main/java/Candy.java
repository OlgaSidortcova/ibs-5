public class Candy extends Sweet {
    private  String size;

    public Candy(String name, double price, String brand, int number, double weight, String size) {
        super(name, price, brand, number, weight);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Candy [" + super.toString() + ", размер = " + size + "]";

    }
}
