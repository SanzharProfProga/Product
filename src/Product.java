import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate madeOfDate;

    private TypeProduct typeProduct;

    public Product(String name, String description, BigDecimal price, LocalDate madeOfDate, TypeProduct typeProduct) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madeOfDate = madeOfDate;
        this.typeProduct = typeProduct;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getMadeOfDate() {
        return madeOfDate;
    }

    public void setMadeOfDate(LocalDate madeOfDate) {
        this.madeOfDate = madeOfDate;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    @Override
    public String toString() {
        return "\nProduct: " +
                "\nName: " + name +
                "\nDescription: " + description +
                "\nPrice: " + price +
                "\nMade of date: " + madeOfDate +
                "\nType product: " + typeProduct;
    }
}
