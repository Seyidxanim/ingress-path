package lesson_11;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private Integer userId;

    public Integer quantity;

    public Product(Integer id, String name, Double price, Integer userId, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.userId = userId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getUserId() {
        return userId;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
