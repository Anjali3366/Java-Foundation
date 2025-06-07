public class R17_RemoveDuplicate {
    public static void removeDuplicate(String str, boolean map[], int idx, StringBuilder newStr) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            // duplicate hai
            removeDuplicate(str, map, idx + 1, newStr);
        } else {
            map[ch - 'a'] = true;
            removeDuplicate(str, map, idx + 1, newStr.append(ch));
        }

    }

    public static void main(String[] args) {
        String str = "anjaliaqsaaii";
        removeDuplicate(str, new boolean[26], 0, new StringBuilder(""));

    }

}
