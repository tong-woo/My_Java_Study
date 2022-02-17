/**
 *.length()
 *.concat()
 *.equals()
 *.indexOf()
 *.charAt()
 *.substring()
 *.toUpperCase() / .toLowerCase()
*/

public class StringMethod {
    public static void main(String[] args){
        String str1 = "Hello World!";
        String str2 = "Hi!";
        String str3 = "";
        System.out.println(str1.length()); // Prints: 12
        System.out.println(str2.length()); // Prints: 3
        System.out.println(str3.length()); // Prints: 0

        String line = "It was the best of times, it was the worst of times.";
        System.out.println(line.substring(7,23)); // Prints: it was the worst of times.

    }
}




