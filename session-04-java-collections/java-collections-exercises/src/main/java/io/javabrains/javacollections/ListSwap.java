package io.javabrains.javacollections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.List;
public class ListSwap {

    public <T> void listSwap(List<T> list, int idx1, int idx2){
        T temp = list.get(idx1);
        list.set(idx1, list.get(idx1));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        
    }
}
