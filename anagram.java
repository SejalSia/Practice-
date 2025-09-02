import java.util.*;
class anagram {

    static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        // for lowercase a-z
        int[] freq = new int[26];

        // Count frequency of each character in s1
        for (int i = 0; i < s1.length(); i++)
            freq[s1.charAt(i) - 'a']++;

        // Subtract frequency using characters from s2
        for (int i = 0; i < s2.length(); i++)
            freq[s2.charAt(i) - 'a']--;

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "worth";
        String s2 = "throw";

        if (areAnagrams(s1, s2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
