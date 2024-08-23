## Java

### 1. JDK是什么?有哪些内容组成?
    JDK是java开发工具包
    * JVM虚拟机: java程序运行的地方
    * 核心类库: java已经写好的东西,我们可以直接使用
    * 开发工具: javac, java, jdb, jhat...
### 2. JER是什么?有哪些内容组成?
    JRE是java运行环境
    JVM,核心类库,运行工具
### 3. JDK,JRE,JVM三者的包含关系
    * JDK包含了JRE
    * JRE包含了JVM

~~~java
public class HelloWorld{
    public static void main(String[] args) {
        System.out.println('Hello World');
    }
}
~~~

### \t 制表符
在打印的时候,把前面的字符串的长度补齐到8,或者8的整数倍,最少补一个空格,最多补8个空格

~~~java
public class item {
    public static void main(String[] args) {
        System.out.println("name" + '\t' + "age");
        System.out.println("tom" + '\t' + "age");
    }
}
~~~

### 变量的定义格式
1. 变量名不允许重复定义
2. 一条语句可以定义多个变量
3. 变量在使用之前一定要进行赋值
4. 变量的作用域范围
~~~markdown
数据类型 变量名 = 值;
    |     |      |
    |     |      | 
    |     |     存在空间里的数值
    |    为空间起的名字
    数据类型: 为空间中存储的数据,加入类型[限制] 整数,小数...
    int name = value; 整数
    double name = value; 小数(浮点数)
    int name = value, age = 24, gender = man;
    
~~~

### 不同进制在代码中的表现形式
二进制: 以0b开通
十进制: 默认
八进制: 以0开通
十六进制: 以0x开头

#### 任意进制转十进制
    公式: 系数 * 基数的权次幂 相加

    系数: 就是每一位上的数

    基数: 当前进制数

    权: 从右往左,以此为0,1,2,3...

#### 十进制转其他进制

除基取余法

不断地除以基数(几进制,基数就是几)得到余数,直到商为0,再将余数倒着拼起来即可

### [ASCII](https://www.runoob.com/w3cnote/ascii.html)

### 数据类型

### JAVA 语言的数据类型分为: 基本数据类型,引用数据类型

// 如果定义long类型的变量

// 在数值后面需要加一个l | L作为后缀

// float加F
> 整数和小数取值范围大小关系
> 
> double > float > long > int > short> byte

![img.png](img.png)

### 标识符
#### 标识符的命名规则
1. 由数字,字母,_,$组成
2. 不能以数字开头
3. 不能是关键字
4. 区分大小写

### 键盘输入[Scanner]
~~~java
// 导包
import java.util.Scanner;
// 创建对象
Scanner sc = new Scanner(System.in);
// 接收数据
int num = sc.nextInt();
~~~
