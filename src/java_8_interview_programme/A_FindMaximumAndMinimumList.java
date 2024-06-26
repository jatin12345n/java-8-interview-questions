package java_8_interview_programme;


//TODO . Write a program to find the maximum and minimum elements in a list of integers using the Stream API in Java 8.

import java.util.ArrayList;
import java.util.List;

public class A_FindMaximumAndMinimumList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();//TODO here we have created list object and we will add elements to it
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);

        int max = numbers.stream().max(Integer::compare).get();
        //TODO here we are using numbers.stream() to create stream from a numbers list
        // we have used max function to find to maximum element from the list
        // the get() method of the stream API is used to retrieve the result of an operation performed on a stream

        int min = numbers.stream().min(Integer::compare).get();
        //TODO here we are using numbers.stream() to create stream from a numbers list
        // we have used min function to find to minimum element from the list
        // The get() method of the Stream API is used to retrieve the result of an operation performed on a stream


        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
