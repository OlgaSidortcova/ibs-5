public abstract class Sweet {
    private String name;
    private Double price;
    private String brand;
    private int number;
    private double weight;

    public Sweet(String name, double price, String brand, int number, double weight) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.number = number;
        this.weight = weight;
    }

    public Sweet(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public  String toString(){
        return  "Наименование = " + name + ", цена = " + price + ", вес = " + weight + ", id = " + number + ", фирма = " + brand ;


    }
}
