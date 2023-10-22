public class Pangram {
    public static boolean isPangram(String input) {
        // Convert the input to lowercase
        input = input.toLowerCase();

        // Create a boolean array to track the presence of each letter
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through the input and mark the presence of each letter
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all letters are present (all values in the array are true)
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input);

        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
