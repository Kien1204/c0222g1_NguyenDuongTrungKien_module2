package _11_java_collection_framework.exercise.practice_arraylist_linkedlist.linked_list;

public class Product {
    private String productName ;
    private  int idProduct;
    private int price;

    public Product() {
    }

    public Product(String productName, int idProduct, int price) {
        this.productName = productName;
        this.idProduct = idProduct;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int  getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", id=" + idProduct +
                ", price=" + price +
                '}';
    }
}
