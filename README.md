# Algorithm

## 每日一题 && 天天进步一点点   

题目来于 LeetCode，剑指offer，Coding Interview，ZOJ，POJ 等平台。

欢迎Coders对代码加以指正和提议！

---

### 常见问题总结
1. 两整数求平均值      
`average = min + (max - min) / 2`       *防止两整数的和越界*    

2. 两整数交换      
> `i=i+j; j=i-j; i=i-j;`       *需注意i+j可能存在整数溢出问题（同号）*
> `i=i-j; j=i+j; i=j-i;`       *需注意i-j可能存在整数溢出问题（异号）*
> `i^=j; j^=i; i^=j;`           

3. 链表节点交换      
>方式一： 修改next指针的值进行节点的交换      
>方式二： *修改val字段的值* 等价节点交换      
>练习： leetcode: 24. Swap Nodes in Pairs

### 编辑器
1. IDEA
> 下载代码git clone -> 打开idea -> 选择打开项目 -> 选择algorithm并进行环境配置  
 
2. Atom 或 Sublime text
> 下载代码git clone -> 打开编辑器 -> 加入项目 -> 选择algorithm
