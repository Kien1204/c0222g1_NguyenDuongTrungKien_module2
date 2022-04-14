package _10_stack_queue.exercise.demerging;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainTest {
    public static void main(String[] args) {
        Queue<Customer> NAM = new LinkedList<>();
        Queue<Customer> NU = new LinkedList<>();

        Customer[] customers = new Customer[5] ;
        customers[0] = new Customer("Kien", false, 18);
        customers[1] = new Customer("Duy", false, 19);
        customers[2] = new Customer("Nhi", true, 20);
        customers[3] = new Customer("Hao", false, 21);
        customers[4] = new Customer("Duyen", true, 22);

        for (Customer item : customers) {
            if (item.isGender()){
                NAM.add(item);
            } else {
                NU.add(item);
            }
        }
        List<Customer> orderedList = new ArrayList<>();
        while (NU.size() > 0){
            orderedList.add(NU.remove());
        }
        while (NAM.size() > 0){
            orderedList.add(NAM.remove());
        }
        for (Customer item: orderedList) {
            System.out.println(item.toString());
        }
    }
}
