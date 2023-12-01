import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductSorter {
    private List<Product> products;
    private List<FoodProduct> foodProducts;
    private List<HealthProduct> healthProducts;
    private List<ElectricProduct> electronicProducts;

    public ProductSorter() {
        products = new ArrayList<>();
        foodProducts = new ArrayList<>();
        healthProducts = new ArrayList<>();
        electronicProducts = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectronicProducts() {
        return electronicProducts;
    }

    public boolean sortProduct(Product product) {
        products.add(product);

        if (product instanceof FoodProduct) {
            foodProducts.add((FoodProduct) product);
            foodProducts.sort(Comparator.comparing(Product::getProductID));
        } else if (product instanceof HealthProduct) {
            healthProducts.add((HealthProduct) product);
            healthProducts.sort(Comparator.comparing(Product::getProductID));
        } else if (product instanceof ElectricProduct) {
            electronicProducts.add((ElectricProduct) product);
            electronicProducts.sort(Comparator.comparing(Product::getProductID));
        }

        return true;
    }







}
