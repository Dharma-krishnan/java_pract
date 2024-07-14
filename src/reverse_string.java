public class reverse_string {
    public static void main(String args[])
    {
        String rev_words = "";
        String word = "racecar";
        int tot = word.length();
        for (int i = tot - 1; i >= 0; i--) {
            rev_words = rev_words + word.charAt(i);
        }
        System.out.println(rev_words);
    }
}
