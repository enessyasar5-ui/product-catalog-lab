public class Product {
    private int id;
    private double price;
    private String name;
    private String description;

    public Product(int id, double fiyat, String bookName, String explain) {
        this.id = id;
        this.price = fiyat;
        this.name = bookName;
        this.description = explain;
    }

    public String getDescription() {
        return description;
    }

    public String getname() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{id=" + id
                + ", name='" + name + '\''
                + ", price=" + price
                + ", description='" + description + "'}";
    }
}
