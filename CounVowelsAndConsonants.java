
// Count Vowels and Consonants: Write a program to count the number of vowels and consonants in a given string.
public class CounVowelsAndConsonants {
    public static void main(String[] args) {
        String input = "Hello World!";
        Result result = countVowelsAndConsonantsUsingLoop(input);
        System.out.println("Vowels: " + result.vowels);
        System.out.println("Consonants: " + result.consonants);
    }

    public static Result countVowelsAndConsonantsUsingLoop(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase(); // Convert the string to lower case for easier comparison

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') { // Check if the character is an alphabet
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new Result(vowels, consonants);
    }
}
