/**
 * @author sunxiaoyang
 */
public class _242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
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
}
