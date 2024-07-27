package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int a = 5;
        System.out.println(a);
        // Step 2: Convert primitive variables to wrapper objects
        Integer b = a;
        // Step 3: Print   the values of the wrapper objects
        System.out.println(b);
        // Step 4: Convert wrapper objects back to primitive variables
        a = b;
        // Step 5: Print the values of the primitive variables
        System.out.println(a);
    }
}
