package _16_io_binary_file_serialization.exercise.product_management;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        productList.add(new Product(1, "iphone", "apple", 14000000));
        productList.add(new Product(2, "Nokia Lumia", "Nokia", 15000000));
        productList.add(new Product(3, "SamSung Galaxy", "SamSung", 16000000));
        productList.add(new Product(4, "Xiaomi Pro", "Xiaomi", 17000000));
        System.out.println("Input path");
        String path = scanner.nextLine();

        int choice = -1;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. display product:");
            System.out.println("2. add new one: ");
            System.out.println("3. find product :");
            System.out.println("4.exit");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProductList(path);
                    break;
                case 2:
                    addNewProduct(path);
                    break;
                case 3:
                    searchProductInfo(path);
                    break;
            }
        }
    }

    public static void writeFile(String path, List<Product> products) {
        File file = new File(path);
        FileOutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(products);
            oos.close();
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Product> readFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(path);
            ObjectInputStream os = new ObjectInputStream(is);
            productList = (List<Product>) os.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void addNewProduct(String path) {
        List<Product> productList = readFile(path);
        System.out.println("Input id :");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (Product data : productList) {
            if (data.getId() == id) {
                System.out.println("id da ton tai");
                check = false;
                break;
            }
        }
        if (check) {
            int id1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Input name :");
            String name = scanner.nextLine();
            System.out.println("Input brand : ");
            String brand = scanner.nextLine();
            System.out.println("Input price");
            int price = scanner.nextInt();
            Product product = new Product(id, name, brand, price);
            productList.add(product);
            writeFile(path, productList);
        }
    }
    public static void displayProductList(String path) {
        List<Product> productList = readFile(path);
        for (Product item : productList) {
            System.out.println(item.toString());
        }
    }

    public static void searchProductInfo(String path) {
        List<Product> productList = readFile(path);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input name");
        String productName = scanner.nextLine();
        int count = 0;
        for (Product product : productList) {
            if (product.getName().contains(productName)) {
                System.out.println(product.toString());
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("can not find product");
        }
    }
}
