#  方法

- 什么是方法?   在面向对象编程中，管函数叫方法

  ```
  修饰符  static  返回值类型【void】 方法名【小驼峰】（参数列表）{
      方法带代码
      return 。。。；
  }
  ```

- return 作用：1、返回函数对应的类型   2、结束这个方法

  ```
  根据参数个数：
  
  无参方法
  有参方法
  根据返回值类型:
  
  有返回值的方法：
  根据返回值的类型细分为：
  基本数据类型
  引用数据类型
  无返回值的方法
  void
  ```

  

# 方法的重载

- 同名不同参（与修饰符和返回值类型物管部）

- Jvm 通过方法的参数列表调用， 调用不同的方法

  # Scanner 类

  - 通过Scanner类介绍引用类型的基本使用

    1、 导包（Java.lang）

    ```
    import 包名.类名； // import java.util.Scanner;
    ```

    2、 创建对象

    ```
    数据类型 变量名 = new 类名（参数列表）
    Scanner scanner = new Scanner(System.in);
    ```

    3、调用方法

    ```
    变量名.方法名（）；
    int i = scanner.nextInt();
    
    ```

    

  三目运算符

  ```
   x ? y : z
   x 是布尔表达式， true --》 y  false==》 
  ```



#  匿名对象

没有名对象

```
new Scanner()；
```



#  Random类

- 用于生成伪随机数

```
// 0 ~ bound 之间的随机整数 ，左闭右开
```

