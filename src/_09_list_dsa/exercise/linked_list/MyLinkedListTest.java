package _09_list_dsa.exercise.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"coca");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        System.out.println(list.indexOf("coca"));
    }
}
