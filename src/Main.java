public class Main {
    public static void main(String[] args) {
        Product notebook = new Product(1, 29.99, "Notebook", "A5 paper notebook");
        ElectronicProduct headset = new ElectronicProduct(
                2,
                159.99,
                "Headset",
                "Wireless over-ear headset",
                "SoundBox"
        );

        System.out.println(notebook);
        System.out.println(headset);
    }
}
