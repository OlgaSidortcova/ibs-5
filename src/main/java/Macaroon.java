public class Macaroon extends Sweet {

    private int count;

    public Macaroon(String name, Double price, String brand, int number, float weight, int count) {
        super(name, price, brand, number, weight);
        this.count = count;
    }

    public Macaroon() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Macaroon [" + super.toString() + ", количество = " + count + "]";

    }

}
