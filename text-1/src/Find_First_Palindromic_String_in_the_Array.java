public class Find_First_Palindromic_String_in_the_Array {
        public String firstPalindrome(String[] words) {
            for (int i = 0; i < words.length; i++) {
                String sb = words[i];
                int count = 0, left = 0, right = sb.length() - 1;
                while (left < right) {
                    if (sb.charAt(left) != sb.charAt(right)) {
                        count++;
                        break;
                    }
                    left++;
                    right--;
                }
                if (count == 0)
                    return sb;
            }
            return "";
        }
}
