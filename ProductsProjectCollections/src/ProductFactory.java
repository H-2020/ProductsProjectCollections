import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter;
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {

        this.productSorter = productSorter;
    }


    public void createProducts(int amount) {
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int type = random.nextInt(3);
            String name;
            int id = random.nextInt(151);
            switch (type) {
                case 0:
                    name = foodProducts[random.nextInt(foodProducts.length)];
                    productSorter.sortProduct(new FoodProduct(name, id));
                    break;
                case 1:
                    name = healthProducts[random.nextInt(healthProducts.length)];
                    productSorter.sortProduct(new HealthProduct(name, id));
                    break;
                case 2:
                    name = electricProducts[random.nextInt(electricProducts.length)];
                    productSorter.sortProduct(new ElectricProduct(name, id));
                    break;
                default:
                    name = "";
                    break;
            }
        }
    }
}



