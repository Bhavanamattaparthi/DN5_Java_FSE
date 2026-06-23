package com.cognizant.search;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        System.out.println("Linear Search:");

        Product result1 =
                SearchAlgorithms.linearSearch(products, 103);

        System.out.println(result1);

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 =
                SearchAlgorithms.binarySearch(products, 103);

        System.out.println(result2);
    }
}