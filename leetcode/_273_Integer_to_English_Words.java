import java.util.HashMap;

/**
 * Notes:
 * 0 -> Zero
 * 1000000 -> One Million
 *
 * @author sunxiaoyang
 */
public class _273_Integer_to_English_Words {

    public String numberToWords(int num) {
        // Special
        if (num == 0) return "Zero";

        HashMap<String, String> mp = new HashMap<String, String>();
        mp.put("0", "");
        mp.put("00", "");
        mp.put("000", "");
        mp.put("1", "One ");
        mp.put("2", "Two ");
        mp.put("3", "Three ");
        mp.put("4", "Four ");
        mp.put("5", "Five ");
        mp.put("6", "Six ");
        mp.put("7", "Seven ");
        mp.put("8", "Eight ");
        mp.put("9", "Nine ");
        mp.put("10", "Ten ");
        mp.put("11", "Eleven ");
        mp.put("12", "Twelve ");
        mp.put("13", "Thirteen ");
        mp.put("14", "Fourteen ");
        mp.put("15", "Fifteen ");
        mp.put("16", "Sixteen ");
        mp.put("17", "Seventeen ");
        mp.put("18", "Eighteen ");
        mp.put("19", "Nineteen ");
        mp.put("20", "Twenty ");
        mp.put("30", "Thirty ");
        mp.put("40", "Forty ");
        mp.put("50", "Fifty ");
        mp.put("60", "Sixty ");
        mp.put("70", "Seventy ");
        mp.put("80", "Eighty ");
        mp.put("90", "Ninety ");
        mp.put("100", "Hundred ");
        mp.put("1000", "Thousand ");
        mp.put("1000000", "Million ");
        mp.put("1000000000", "Billion ");

        String result = new String();
        int times = 0;
        while (num > 0) {
            StringBuilder sb = new StringBuilder();

            String temp = String.valueOf(num % 1000);

            switch (temp.length()) {
                case 3:
                    sb.append(mp.get(temp.substring(0, 1))).append(mp.get("100"));
                    temp = temp.substring(1, temp.length());
                case 2:
                    if (temp.startsWith("1")) {
                        sb.append(mp.get(temp));
                        break;
                    } else {
                        sb.append(mp.get(temp.substring(0, 1).concat("0")));
                        temp = temp.substring(1, temp.length());
                    }
                case 1:
                    sb.append(mp.get(temp.substring(0, 1)));
                default:
                    break;
            }

            if (!sb.toString().isEmpty() && times > 0) {
                String t = String.valueOf((int) Math.pow(1000, times));
                sb.append(mp.get(t));
            }
            num /= 1000;
            times++;
            result = sb.toString() + result;
        }
        return result.trim();
    }

    public static void main(String[] args) {
        _273_Integer_to_English_Words a = new _273_Integer_to_English_Words();
        System.out.println(a.numberToWords(1000000));
    }
}