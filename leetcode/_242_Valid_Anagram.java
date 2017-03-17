import java.util.HashMap;

/**
 * @author sunxiaoyang
 */
public class _242_Valid_Anagram {

    // 2016-03-24
    public boolean isAnagram_1(String s, String t) {
        char[] sa = s.replaceAll("[^a-z]", "").toCharArray();
        char[] ra = t.replaceAll("[^a-z]", "").toCharArray();
        if (sa.length != ra.length) return false;
        int l = sa.length;
        int[] si = new int[26], ri = new int[26];

        for (int i = 0; i < l; i++) {
            si[sa[i] - 'a']++;
            ri[ra[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (si[i] != ri[i]) {
                return false;
            }
        }
        return true;
    }

    // 2017-03-17
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> sfreq = new HashMap<>();
        HashMap<Character, Integer> tfreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sfreq.put(s.charAt(i), 1 + (sfreq.containsKey(s.charAt(i)) ? sfreq.get(s.charAt(i)) : 0));
            tfreq.put(t.charAt(i), 1 + (tfreq.containsKey(t.charAt(i)) ? tfreq.get(t.charAt(i)) : 0));
        }
        return sfreq.equals(tfreq);
    }
}
