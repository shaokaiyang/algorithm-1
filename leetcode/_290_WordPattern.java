package leetcode;

/**
 *
 * @author sunxiaoyang
 * 1. 在str后加上空格，使str变为 ”单词+空格“ 的组合
 * 2. 若pattern的长度和str中的单词数不一致，返回false
 * 3. 设pattern中第i个字母为x，str第i个单词为AB。将str中所有的AB替换为x，并将pattern中所有x置为0。
 * 4. 循环步骤3，注：若此时pattern中第i个字母是0，则跳过此次替换。
 * 5. 最终比对 原始pettern 和 替换后的str 是否一致 
 *
 */

public class _290_WordPattern {
	public boolean wordPattern(String pattern, String str) {
		String patternTemp = pattern;
		String[] strSplit = str.split(" ");
        str = str.concat(" ");
        
        if(patternTemp.length() != strSplit.length) {
        	return false;
        }
        
		for(int i=0; i<patternTemp.length(); i++) {
			if(patternTemp.charAt(i)!='0') {
				str = str.replaceAll(strSplit[i]+" ", patternTemp.charAt(i)+" ");
				patternTemp = patternTemp.replaceAll(patternTemp.charAt(i)+"", "0"); 
			}
		}
		
		return pattern.equals(str.replaceAll(" ", ""));
    }
	
//	public static void main(String[] args){
//		_290_WordPattern a = new _290_WordPattern();
//		System.out.println(a.wordPattern("tqbfjotld","the quick brown fox jumps over the lazy dog"));
//	}
}
