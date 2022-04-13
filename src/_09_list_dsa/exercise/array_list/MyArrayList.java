package _09_list_dsa.exercise.array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];// không gắn số lượng phần tử cho array list thì mặc định là 10
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];// dòng này  gắn số lượng phần tử;
    }

    private void ensureCapa() { //nếu không khai báo ensureCapa, khi nhập quá capacity 10 sẽ lỗi
        if (size > elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);//Arrays.copyOf :copy phần tử của mảng cũ sang mảng mới
        }
    }

    public void add (E e){
        size+=1 ;
        ensureCapa();
        elements[size-1]=e;
    }
    public boolean add (Object e,int index  ){
        if (index>=0&&index<=size){
            size+=1;
            ensureCapa();
            for (int i = size-2 ; i >=index ; i--) {
                elements[i+1] =elements[i];
            }
            elements[index]=e ;
            return true ;
        }
        return false;
    }
    public Object get(int index ){
        if (index>=0&&index<size){
            return elements;
        }
        return null ;
    }
//    @Override
    public MyArrayList clone (){
        MyArrayList<Object> clone =new MyArrayList<>(elements.length);
        for (Object x:elements) {
            clone.add(x);
        }
        return clone;
    }
    public Object[]getElements(){
        return this.elements ;
    }
    public int size(){
        return size;
    }
    public boolean remove(int index ){
        if (index >=0&&index<size){
            for (int i = index; i < size; i++) {
                elements[i]=elements[i+1];
            }
            size-=1;
            return true;
        }
        return false;
    }
    public void clear (){
        elements=new Object[DEFAULT_CAPACITY];
        size = 0 ;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E e) {
        for (Object x : elements) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }
}

