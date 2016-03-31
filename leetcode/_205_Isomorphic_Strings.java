import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author sunxiaoyang
 */
public class _205_Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        return getPoSet(s).equals(getPoSet(t));
    }

    Set<Set<Integer>> getPoSet(String val) {
        HashMap<Character, Set<Integer>> sm = new HashMap<Character, Set<Integer>>();
        char[] sa = val.toCharArray();
        for (int i = 0; i < sa.length; i++) {
            Set<Integer> temp = sm.get(sa[i]);
            if (temp == null) {
                HashSet<Integer> tx = new HashSet<Integer>();
                tx.add(i);
                sm.put(sa[i], tx);
            } else {
                temp.add(i);
            }
        }
        Set<Set<Integer>> sr = new HashSet<Set<Integer>>();
        for (Map.Entry<Character, Set<Integer>> i : sm.entrySet()) {
            sr.add(i.getValue());
        }
        return sr;
    }

    public static void main(String[] args) {
        _205_Isomorphic_Strings a = new _205_Isomorphic_Strings();
        System.out.println(a.isIsomorphic("aba", "baa"));
    }
}
