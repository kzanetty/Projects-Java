package entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(){
    }

    public Product(String name, Double price, Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public static double average(Product[] p){
        double sum = 0;
        for(int i=0;i < p.length; i++){
            sum += p[i].price;
        }
        double calculateAverage = sum/ (p.length);

        return calculateAverage;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Price: "+price+", Quantity: "+quantity;
    }
}
