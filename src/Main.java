import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product vegetables = new Product("Apple", "Yssyk Kol",
                new BigDecimal(120), LocalDate.of(2023, 2, 22), TypeProduct.VEGETABLES);

        Product electronic = new Product("Phone", "iPhone",
                new BigDecimal(120000), LocalDate.of(2022, 11, 11), TypeProduct.ELECTRONIC);

        Product clothes = new Product("Hoodie", "Black",
                new BigDecimal(3500), LocalDate.of(2023, 1, 10), TypeProduct.CLOTHES);

        Product [] products = {vegetables,electronic,clothes};
        Inventory inventory = new Inventory(products);


        while (true){
            System.out.println("""
               \n
                1: Get all product
                2: Search name product
                3: Search type product
                4: Check Date of made Vegetables
                5: Check date of made Electronic or Clothes
                """);
            int selectMode = new Scanner(System.in).nextInt();
            switch (selectMode){
                case  1 -> {
                    for (Product p:products) {
                        System.out.println(p.toString());
                    }
                }
                case 2 -> {
                    System.out.println(inventory.searchProductName(new Scanner(System.in).nextLine().toUpperCase()));
                }
                case  3 -> {
                    System.out.println(inventory.searchTypeProduct(new Scanner(System.in).nextLine().toUpperCase()));
                }
                case  4 -> {
                    System.out.println(inventory.checkDateOfMadeVegetables(products[0].getMadeOfDate()));
                }
                case  5 -> {
                    for (int i = 1; i < products.length; i++) {
                        System.out.println(inventory.checkDateOfMadeElectronic(products[i].getMadeOfDate()));
                    }

                }
            }

        }
    }
}