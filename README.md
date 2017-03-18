# Algorithm

## 每日一题 && 天天进步一点点   

题目来于 LeetCode，剑指offer，Coding Interview，ZOJ，POJ 等平台。

欢迎Coders对代码加以指正和提议！

---
### LeetCode courses
* CHAPTER 1. ARRAY / STRING
    + 26.Remove Duplicates from Sorted Array
    + 167.Two Sum II - Input array is sorted
    + 242.Valid Anagram
    + 3.Longest Substring Without Repeating Characters
    + 28.Implement strStr()
    + 8.String to Integer (atoi)
* CHAPTER 2. LINKED LIST
    + 237.Delete Node in a Linked List
    + 206.Reverse Linked List
    + 141.Linked List Cycle
    + 21.Merge Two Sorted Lists
    + 24.Swap Nodes in Pairs
* CHAPTER 3. BINARY TREE
    + 104.Maximum Depth of Binary Tree
    + 100.Same Tree
    + 112.Path Sum
    + 257.Binary Tree Paths
    + 98.Validate Binary Search Tree
* CHAPTER 4. STACK AND QUEUE
    + 225.Implement Stack using Queues
    + 20.Valid Parentheses
    + 232.Implement Queue using Stacks
    + 102.Binary Tree Level Order Traversal
* CHAPTER 5. BIT MANIPULATION
    + 136.Single Number
    + 190.Reverse Bits
    + 191.Number of 1 Bits
    + 231.Power of Two
* CHAPTER 6. BINARY SEARCH
    + 278.First Bad Version
    + 374.Guess Number Higher or Lower
    + 35.Search Insert Position
    + 34.Search for a Range
    + 367.Valid Perfect Square

### 常见问题总结
+ 两整数求平均值      
`average = min + (max - min) / 2`       *防止两整数的和越界*    

+ 整数乘积对比   
`1.0 * m * m == num`       *类似乘积对比， 需转为double型， 避免整数溢出*

+ 两整数交换      
    1. `i=i+j; j=i-j; i=i-j;`       *需注意i+j可能存在（同号）整数溢出问题*   
    2. `i=i-j; j=i+j; i=j-i;`       *需注意i-j可能存在（异号）整数溢出问题*   
    3. `i^=j; j^=i; i^=j;`           

+ 判断某整数是否为2的整数次幂    
>问题转化为：判断整数是否为正整数且二进制中仅存在一位1   
>(n > 0 && (n & (n - 1)) == 0)

+ 链表节点交换      
    1. 修改next指针的值进行节点的交换      
    2. *修改val字段的值* 等价节点交换      
>练习： leetcode: 24. Swap Nodes in Pairs   
>练习： leetcode: 237. Delete Node in a Linked List

+ 链表双指针问题   
> 1. 判断是否有环   
> 2. last k-th node

### 编辑器
1. IDEA
> 下载代码git clone -> 打开idea -> 选择打开项目 -> 选择algorithm并进行环境配置  
 
2. Atom 或 Sublime text
> 下载代码git clone -> 打开编辑器 -> 加入项目 -> 选择algorithm
