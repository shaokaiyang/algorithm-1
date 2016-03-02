/**
 * 左移( << )
 * 右移( >> ) 高位补符号位
 * 无符号右移( >>> ) 高位补0
 * 位与( & )
 * 位或( | )
 * 位异或( ^ )
 * 位非( ~ )
 *
 * @author sunxiaoyang
 */

public class _191_Number_of_1_Bits {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n & 1;
            n >>>= 1;
//            n &= (n - 1);
//            n >>>= 1;
//            sum++;
        }

        return sum;
    }

    //    4294967295 (11111111111111111111111111111111)
    public static void main(String[] args) {
        _191_Number_of_1_Bits a = new _191_Number_of_1_Bits();
        System.out.println(a.hammingWeight(11));
    }
}
