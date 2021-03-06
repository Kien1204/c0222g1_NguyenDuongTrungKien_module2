package _11_java_collection_framework.exercise.practice_arraylist_linkedlist.linked_list;

import java.util.*;

public class ProductManager {

    public static void addProduct( LinkedList<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm: ");
        String productName=(sc.nextLine());
        System.out.println("nhập ID : ");
        int id = (sc.nextInt());
        System.out.println("nhập giá : ");
        int priceProduct=(sc.nextInt());
        Product product = new Product(productName,id,priceProduct);
        products.add(product);
    }

    public static void editProduct(LinkedList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Nhập ID sản phẩm muốn sửa");
        int productID = scanner.nextInt();
        for (Product data : products) {
            if (data.getIdProduct() == productID) {
                flag = true;
                System.out.println("nhập thông tin sản phẩm");
                data.setProductName(scanner.nextLine());
                System.out.println("nhập giá sản phẩm");
                data.setPrice(Integer.parseInt(scanner.nextLine()));
            }
        }
        if (!flag) {
            System.out.println("không có thông tin");
        }
    }

    public static void removeProduct(LinkedList<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id muốn xóa : ");
        int id = sc.nextInt();
        boolean flag = false;
        Product temp = new Product();
        for (Product product : products) {
            if (product.getIdProduct() == id) {
                temp = product;
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("không tìm thấy thông tin");
        }
        products.remove(temp);
    }


    public static void showProduct(LinkedList <Product> products) {
        if (products.size() == 0) {
            System.out.println("không có sản phẩm ");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }


    public static void searchProduct(LinkedList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm bạn muốn tìm : ");
        String p = scanner.nextLine();
        int count = 0 ;
            for (Product product : products) {
                if (product.getProductName().equals(p)) {
                    System.out.println("Có sản phẩm " + product.getProductName());
                    System.out.println(product.toString());
                    count++;
                }
        }
            if (count==0){
                System.out.println("không có sản phẩm này ");
            }
    }


    public static void ascending(LinkedList<Product> products){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }
    public static void descending(LinkedList<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

}
