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

public class _190_ReverseBits {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse = reverse << 1 | (n & 1);
            n >>>= 1;
        }
        return reverse;
    }

    public static void main(String[] args) {
        _190_ReverseBits a = new _190_ReverseBits();
        System.out.println(a.reverseBits(1));
    }
}
