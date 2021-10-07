[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=5792644&assignment_repo_type=AssignmentRepo)

# W03

#### 代码工作原理的理解

```example/encoder``` 文件夹下主要工作有两个：

- 通过 ```SteganographyFactory``` 的main函数可以将排序函数加密到图片中
- 在父类加载器的双亲委托之后，找不到该类。则会调用 ```SteganographyClassLoader``` 的 findclass 方法解析图片从而得到字节码（注：如果想让隐写术图中隐藏的类工作需要先删除 ```example/``` 目录下的排序类，如果没有删除则 AppClassLoader 会在目录中找到该类而不会掉用上述的一系列方法）

#### 隐写术图URL

[InsertionSort](https://github.com/jwork-2021/jw03-vectormoon/blob/main/example.InsertionSorter.png)

[SelectionSort](https://github.com/jwork-2021/jw03-vectormoon/blob/main/example.SelectionSorter.png)

#### 排序动画

SelectionSort: [SelectionSort](https://asciinema.org/a/440585)

InsertionSort: [InsertionSort](https://asciinema.org/a/440586)

#### 其他隐写术图

使用 BanpinLi 同学的希尔排序: [BanpinLi_ShellSort](https://github.com/jwork-2021/jw03-BanpinLi/blob/main/example.ShellSorter.png)

结果如下：[result](https://asciinema.org/a/440587)

