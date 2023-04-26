public abstract class Meals {

    private String name;
    private int price;

    public Meals(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meals{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
