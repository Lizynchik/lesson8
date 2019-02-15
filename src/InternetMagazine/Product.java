package InternetMagazine;

public class Product extends Category {
    private String name;
    private int price, rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void watchingCategoryProducts(Product[] products, Category category) {
        System.out.println("Products of " + category.getName() + " category: " + products[0].name + ", with price: " +
                products[0].price + " and rating: " + products[0].price + ", " + products[1].name + ", with price: " +
                products[1].price + " and rating: " + products[1].price);
    }
}
