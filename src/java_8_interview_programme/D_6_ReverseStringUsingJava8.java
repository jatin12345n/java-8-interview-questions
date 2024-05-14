package java_8_interview_programme;

public class D_6_ReverseStringUsingJava8 {

    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = input.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> b + a);
        System.out.println("Reverse String is :" + reversed);

        //TODO Here, input.chars() returns a stream of the ASCII code of each character in the string input.
        // mapToObj(c -> String.valueOf((char)c)) converts each ASCII code to the corresponding character using the String.ValueOf((char)c) method.
        // Finally, reduce("", (a, b)->b+a) uses the reduce method to concatenate each character in the stream,
        // starting with an empty string as the initial accumulator value and adding each subsequent character to the beginning od the string
        // This results in a string that is the reverse of the original input string

    }
}
