package org.example;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private Long id;
    private String name;
    private Double price;
    private Float discount;

    public Product() {
    }

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Product(Long id,  String name,Double price,Float discount ) {
        this.id = id;
        this.discount = discount;
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    @Override
    public int compareTo(Product p2) {
        return this.id.compareTo(p2.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
