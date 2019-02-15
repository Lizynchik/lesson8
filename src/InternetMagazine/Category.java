package InternetMagazine;

import java.util.Objects;

public class Category {
    private String name;
    public static Product[] products = new Product[3];

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Category() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Product[] getProducts() {
        return products;
    }

    public static void setProducts(Product[] products) {
        Category.products = products;
    }

    public void watchingCatalogs(Category category) {
        System.out.println("Category catalog " + category.name);
    }
}



