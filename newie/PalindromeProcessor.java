import java.util.ArrayList;

public class PalindromeProcessor {

    public String longestPalindromeSubstring(String str) {
        // keluarkan susbtring palindrome terpanjang
        ArrayList<String> listsubstringpalindrome = new ArrayList<String>();
        String substring;
        StringBuilder substrings;
        String check_string;
        for (int i = 0;i < str.length();i++)
        {
            for (int j = i + 1 ; j < str.length();j++)
            {
                substring = str.substring(i,j);
                substrings = new StringBuilder(substring);
                substrings.reverse();
                check_string = new String(substrings);
                if (check_string.toLowerCase().equals(substring.toLowerCase()))
                {
                    listsubstringpalindrome.add(substring);
                }
            }
        }
        int max_length = 0;
        String max_string = "";
        for (String string : listsubstringpalindrome)
        {
            if (string.length() > max_length)
            {
                max_string = string;
            }
        }
        return max_string;
    }
}