public class Doughnut extends Sweet {

    private String taste;

    public Doughnut(String name, double price, String brand, int number, double weight, String taste) {
        super(name, price, brand, number, weight);
        this.taste = taste;
    }

    public Doughnut() {
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Doughnut [" + super.toString() + ", вкус = " + taste + "]";

    }
}
