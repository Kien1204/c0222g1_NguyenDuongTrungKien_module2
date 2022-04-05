package _04_class_object.exercise.classQuadraticEquation;

import java.util.Scanner;

public class DisplayQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập giá trị cho a");
        double a = scanner.nextDouble();
        System.out.println("nhập giá trị cho b");
        double b = scanner.nextDouble();
        System.out.println("nhập giá trị cho c");
        double c = scanner.nextDouble();
        QuadraticEquation display  = new QuadraticEquation(a,b,c);

    if (display.getDiscriminant()>0){
        System.out.println("nghiệm 1 "+ display.getRoot1());
        System.out.println("nghiệm 2 "+ display.getRoot2());
        }
    if (display.getDiscriminant()==0){
        System.out.println("nghiệm 1 "+ display.getRoot1());
    }
        System.out.println(display);
    }
}
