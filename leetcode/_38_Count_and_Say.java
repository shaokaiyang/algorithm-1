/**
 * Notes:
 * 计数报数序列按如下规律开始递增：
 * 1，11，21，1211，111221，……
 * 1 读作“1个1”或11.
 * 11 读作“2个1”或21.
 * 21 读作“1个2，1个1”或1211.
 * 给定一个整数n，生成第n个序列。
 *
 * @author sunxiaoyang
 */
public class _38_Count_and_Say {

    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder("1");

        while (--n != 0) {
            char[] ns = result.toString().toCharArray();
            result.delete(0, result.length());
            int count = 1;
            char current = ns[0];
            for (int i = 1; i < ns.length; i++) {
                if (current == ns[i]) {
                    count++;
                } else {
                    result.append(count).append(current);
                    count = 1;
                    current = ns[i];
                }
            }
            result.append(count).append(current);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        _38_Count_and_Say a = new _38_Count_and_Say();
        System.out.println(a.countAndSay(5));
    }
}
