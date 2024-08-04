package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.*; //How to import?

public class ListExercise {

    public static void main(String[] args) {
        //List<Integer> al = new ArrayList<>();
        List<Integer> al = List.of(3, 1, 2, 4, 6);
        
        // Iterator<Integer> itr = new Iterator<>();
        // for(Integer i: al){
        //     System.out.println(i);
        // }

        for(int i: al){
            System.out.println(i);
        }

    }

}
