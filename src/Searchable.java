import java.time.LocalDate;

public interface Searchable {
    String searchTypeProduct(String searchTypeProduct);
    String searchProductName(String searchProductName);
    String checkDateOfMadeVegetables(LocalDate dateOfMadeVegetables);
    String checkDateOfMadeElectronic(LocalDate dateOfMadeElectronic);

}
