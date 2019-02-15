package InternetMagazine;

import java.time.LocalDate;
import java.util.Scanner;

public class Basket extends Product {
    public String choice;
    String choosedProduct[] = new String[2];
    LocalDate today = LocalDate.now();


    Basket(String name, int price, int rating) {
        super(name, price, rating);

    }

    public Basket() {
    }

    public String[] choiceProduct(Product... product) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < choosedProduct.length; i++) {
            System.out.println("Choose product from list and write name ");

            if (scan.hasNextLine()) {
                choice = scan.nextLine();
                choosedProduct[i] = choice;
            }
            System.out.println("Thanks for choice");
        }

        for (String prod : choosedProduct) {

            System.out.println(prod);
            switch (prod) {
                case "T-short":
                    System.out.println(Basket.getProducts().toString());
                    System.out.println(product.toString());
                    break;
                case "blue T-short":
                    System.out.println(Basket.getProducts());
                    break;
                case "red Skirt":
                    System.out.println(Basket.getProducts());
                    break;
                case "blue Skirt":
                    System.out.println(Basket.getProducts());
                    break;
                default:
                    System.out.println("Error");

            }
        }
        return choosedProduct;
    }


    public void buyingProducts(String choosedProduct[]) {
        System.out.print("Your choosed product: ");
        for (String prod : choosedProduct) {
            System.out.print(prod + " ," + " in " + today + " ");

        }
    }
}

