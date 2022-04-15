package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Product> products =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("---my list---");
            System.out.println("1.add");
            System.out.println("2.edit");
            System.out.println("3.delete");
            System.out.println("4.show");
            System.out.println("5.find");
            System.out.println("6.sort ascending");
            System.out.println("7.sort descending");
            System.out.println("8.exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    ProductManager.addProduct(products);
                case 2:
                    ProductManager.editProduct(products);
                case 3:
                    ProductManager.addProduct(products);
                case 4:
                    ProductManager.addProduct(products);
                case 5:
                    ProductManager.addProduct(products);
                case 6:
                    ProductManager.addProduct(products);
                case 7:
                    ProductManager.addProduct(products);
                case 8:
                  System.exit(1);

            }
        }
    }
}
