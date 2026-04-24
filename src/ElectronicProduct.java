public class ElectronicProduct {
    private final String manufacturer;
    private final Product product;

    public ElectronicProduct(int id, double price, String name, String description, String manufacturer) {
        this.product = new Product(id, price, name, description);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{id=" + product.getId()
                + ", name='" + product.getname() + '\''
                + ", price=" + product.getPrice()
                + ", manufacturer='" + manufacturer + '\''
                + ", description='" + product.getDescription() + "'}";
    }
}
