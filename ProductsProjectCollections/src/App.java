public class App {
    public static void main(String[] args) {
        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);
        productFactory.createProducts(100);

        System.out.println("Food products: " + productSorter.getFoodProducts());
        System.out.println("Health products: " + productSorter.getHealthProducts());
        System.out.println("Electronic products: " + productSorter.getElectronicProducts());
        System.out.println("Number of products: " + productSorter.getProducts().size());
    }
}
