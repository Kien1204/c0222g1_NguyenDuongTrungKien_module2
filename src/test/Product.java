package test;

public class Product {
    private String nameProduct ;
    private int idProduct ;
    private int priceProduct;

    public Product() {
    }

    public Product(String nameProduct, int idProduct, int priceProduct) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", idProduct=" + idProduct +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
