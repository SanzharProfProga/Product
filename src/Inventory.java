import java.time.LocalDate;
import java.time.Period;

public class Inventory implements Searchable {
    private Product [] products;

    public Inventory(Product[] products) {
        this.products = products;
    }

    public Inventory() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String searchTypeProduct(String searchTypeProduct) {
        for (Product product:products) {
            if (product.getTypeProduct().name().equals(searchTypeProduct)){
                System.out.println(product.toString());
            }
        }
        return "Great";
    }

    @Override
    public String searchProductName(String searchProductName) {
        for (Product product:products) {
            if (product.getName().toUpperCase().equals(searchProductName)){
                System.out.println(product.toString());
            }
        }
        return "Great";
    }

    @Override
    public String checkDateOfMadeVegetables(LocalDate dateOfMadeVegetables) {
        byte date = (byte) Period.between(dateOfMadeVegetables,LocalDate.now()).getDays();
        if (date >= 10){
            System.out.println("Prosrok");
        }else {
            System.out.println(date);
        }
        return null;
    }

    @Override
    public String checkDateOfMadeElectronic(LocalDate dateOfMadeElectronic) {
        byte date = (byte) Period.between(dateOfMadeElectronic,LocalDate.now()).getMonths();
        if (date >= 6){
            System.out.println("Sale 50%");
        }else {
            System.out.println(date);
        }
        return null;
    }
}
