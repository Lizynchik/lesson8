package InternetMagazine;

import InternetMagazine.Product;
import InternetMagazine.User;

import static InternetMagazine.User.log;
import static InternetMagazine.User.pass;

public class Demo {


    public static void main(String[] args) {
        User user = new User();

        Product[] product1 = new Product[4];
        Product[] product2 = new Product[4];

        product1[0] = new Product("red T-short", 44, 2);
        product1[1] = new Product("blue T-short", 53, 5);
        product2[0] = new Product("red Skirt", 34, 4);
        product2[1] = new Product("blue Skirt", 63, 5);

        Category category1 = new Category("T-shorts", product1);
        Category category2 = new Category("Skirts", product2);
        Basket basket = new Basket();

        System.out.println("Logins list:");

        user.list(User.Users.User1);
        user.list(User.Users.User2);
        user.list(User.Users.User3);

        user.authentication();

        category1.watchingCatalogs(category1);
        category2.watchingCatalogs(category2);

        product1[0].watchingCategoryProducts(product1, category1);
        product2[0].watchingCategoryProducts(product2, category2);

        String choosed[] = basket.choiceProduct(product1[0],product2[0]);

        basket.buyingProducts(choosed);


    }


}

