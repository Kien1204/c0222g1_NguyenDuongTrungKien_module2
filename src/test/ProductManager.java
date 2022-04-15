package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void addProduct(List<Product> myList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm ");
        String nameProduct = sc.nextLine();
        System.out.println("nhập Id sản phẩm ");
        int idProduct = sc.nextInt();
        System.out.println("nhập giá sản phẩm ");
        int priceProduct = sc.nextInt();
        Product products = new Product(nameProduct, idProduct, priceProduct);
        myList.add(products);
    }

    public static void editProduct(List<Product> myList) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("nhập tên sản phẩm muốn sửa");
        String reName = sc.nextLine();
        for (Product data : myList) {
            if (data.getNameProduct().equals(reName)) {
                flag = true;
                System.out.println("nhập lại tên sản phẩm");
                data.setNameProduct(sc.nextLine());
                System.out.println("nhập lại ID sản phẩm ");
                data.setIdProduct(Integer.parseInt(sc.nextLine()));
            }

        }
        if (!flag) {
            System.out.println("không có sản phẩm này ");
        }
    }

    public static void deleteProduct(List<Product> myList) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        String deleteName = scanner.nextLine();
        for (Product data : myList) {
            if (data.getNameProduct().equals(deleteName)) {
                myList.remove(data);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("không xóa được ");
        }
    }

    public static void showProduct(List<Product> myList) {
        if (myList.size() == 0) {
            System.out.println("không có sản phẩm");
        }
        for (Product data : myList) {
            System.out.println(data);
        }
    }

    public static void findProduct(List<Product> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên muốn tìm ");
        String findName = scanner.nextLine();
        int count = 0;
        for (Product data : myList) {
            if (data.getNameProduct().equals(findName)) {
                System.out.println(data.toString());
                count++;
            }

        }
        if (count == 0) {
            System.out.println("không tìm thấy ");
        }
    }

    public static void ascending(List<Product> myList) {
        Collections.sort(myList, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPriceProduct() - o2.getPriceProduct();
            }
        });
    }

    public static void descending(List<Product> myList) {
        Collections.sort(myList, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPriceProduct() - o1.getPriceProduct();
            }
        });
    }
}
