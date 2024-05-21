package java_8_interview_programme;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//TODO find the second largest number in an array using stream API
public class B_FindSecondLargestInArray {

    public static void main(String[] args) {
        int[] numbers = {5,55,99,44,66,88,33};

        int secondLargest = Arrays.stream(numbers)
                .sorted()
                .distinct()
                .skip(numbers.length - 2)
                .findFirst()
                .orElse(-1);

        //TODO we have used Array.stream(numbers) to create stream from array of numbers
        // after that we are using sorted method , this method will do sorting of numbers
        // and we are also using distinct method so it will have only unique numbers after sorting
        // and we are using intermediate operation as SKIP() to skip the first number from sorted array so we can get second highest
        // and we are using findFirst as terminal operation which will find first element from sorted array
        // as we have already skipped top number so we will get second highest number in findFirst
        // orElse(-1) will give -1 output if it does not find any second highest

        System.out.println("Second largest number in the array is:" + secondLargest);


    }
}
