package _11_java_collection_framework.exercise.practice_arraylist_linkedlist.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> product = new ArrayList<>();
        Product product1 = new Product("pepsi",1,100000);
        Product product2 = new Product("coca",2,15000);
        product.add(product1);
        product.add(product2);
        while (true) {
            System.out.println("-------List Product-------");
            System.out.println("1. Add products");
            System.out.println("2. Edit products information");
            System.out.println("3. Delete products by id");
            System.out.println("4. Display products list");
            System.out.println("5. Search products by name");
            System.out.println("6. Sort products by cost ascending");
            System.out.println("7. Sort products by cost descending");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ProductManager.addProduct(product);
                    break;
                case 2:
                    ProductManager.editProduct(product);
                    break;
                case 3:
                    ProductManager.removeProduct(product);
                    break;
                case 4:
                    ProductManager.showProduct(product);
                    break;
                case 5:
                    ProductManager.searchProduct(product);
                    break;
                case 6:
                    ProductManager.ascending(product);
                    break;
                case 7:
                    ProductManager.descending(product);
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please re-enter your choice: ");
            }
        }
    }
}
