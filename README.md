个人学习设计模式的相关代码实现

## UML相关概念

UML(Unified *统一* Modeling *建模* Language 语言)：一种可视化的标准建模语言，它是一种分析和设计语言，通过UML可以构造软件系统的蓝图。

>- 软件工程就像盖楼提前设计蓝图一样需要使用模型来**<u>描述一个软件</u>**
>- 在设计模式中，使用UML来分析和设计每个模式的结构，描述每一个模式实例，并对部分模式进行深入的解析

### UML结构之视图

> 这里并没有过多解释各种图，实际上对名称的了解结合真实案例，更容易记忆深刻。
>
> 并且在设计模式的学习中，仅仅**<u>*类图、顺序图、状态图*</u>**使用最为频繁，更多的图遇到了再深入学习吧。

在UML建模过程中，使用不同的视图从不同的角度来描述软件系统。

<u>UML包括5种视图</u>：*用户视图、结构视图、行为视图、实现视图、环境视图*

1. 用户视图：以**用户的观点**表示系统的目标，它是所有视图的核心，该视图描述系统的需求。
   - <u>*用例图（Use Case Diagram）*</u>
2. 结构视图：表示**系统的静态行为**，描述系统的静态元素，如包、类与对象，以及它们之间的关系
   - <u>*类图（Class Diagram）*</u>
   - 对象图（Object Diagram）
   - 包图（Package Diagram）
   - 组合结构图（Composite Structure Diagram）
3. 行为视图：表示**系统的动态行为**，描述系统的组成元素如对象在系统运行时的交互关系
   - <u>*状态图（State Diagram）*</u>
   - 活动图（Activity Diagram）
   - <u>*顺序图（Sequence Diagram）又称时序图或序列图*</u>
   - 通信图（Communication Diagram）
   - 定时图（Timing Diagram）
   - 交互概览图（Interaction Overview Diagram）
4. 实现视图：表示系统中**逻辑元素的分布**，描述系统中物理文件以及它们之间的关系
   - 组件图（Component Diagram）
5. 环境视图：表示系统中**物理元素的分布**，描述系统中硬件设备以及它们之间的关系
   - 部署图（Deployment Diagram）

### 类图

类图是使用频率最高的UML图形之一。

#### 类与类图

![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_1.png)

![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_0.png)

#### 类之间的关系

记得课堂上直接看程序的UML图，总是不明白类图各个类之间不同箭头表明的意思，导致理解上很吃力。所以首先来熟悉类之间不同的箭头含义，对我们理解或者自己画类图如有神助！

> 其实不光是类图，任何UML图，先去理解各种图的各种符号元素（不同的箭头，方框，圆形）代表的真实含义，才能对整个图有个大局观。

1. 关联关系：用于表示一类对象与另一类对象之间有关系，***基本上就是类的属性使用了其他对象***

   >有双向关系、单向关系、自关联、多重性关联、聚合关系、组合关系

   - 双向关联

     ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_双向关联.png)

   - 单向关联

     ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_单向关联.png)

   - 自关联

     ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_自关联.png)

   - 多重性关联

     - 1..1 : 表示**1个**对象与该类对象有关系
     - 0..* : 表示**0个或多个**与该类对象有关系
     - 1..* : 表示**1个或多个**与该类对象有关系
     - 0..1 : 表示**没有或1个**与该类对象有关系
     - m..n : 表示**最少m，最多n个**与该类对象有关系

     ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_多重性关联.png)

   - 聚合关系：类之间整体和部分的关系，成员对象可以脱离整体**<u>*独立存在*</u>**。

     ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_聚合关系.png)

   - **组合关系**:**<u>*也表示类之间整体和部分的关系，组合的部分和整体具有统一的生存期。如人和嘴巴的关系，同存亡。*</u>**

     ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_组合关系.png)

2. 依赖关系：表示一个事物使用另一个事物时使用依赖关系，***基本上就是方法需要传递另一个对象***

   ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_依赖关系.png)

3. 泛化关系：表示继承关系

   ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_泛化关系.png)

4. 接口与实现关系：类实现了接口

   ![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_接口与实现关系.png)



### 顺序图（时序图）

看示例图就够了， 注意不同的箭头代表不同的意思，之后看源码正确使用即可。

![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_顺序图.png)

### 状态图

同样看示意图即可，注意并不是一定要正向改变状态呢，也可以由之后的状态向前画箭头改变状态

**<u>*状态模块还可以嵌套状态图，这种被称为复合状态。*</u>**

![](https://raw.githubusercontent.com/Mretron/designPattern/main/picture/001_状态图.png)



## 面向对象设计原则

实习过了才发现，很多法则，在不知不觉中就在用了。再看设计模式这本书比课堂学确实轻松一些了。

***如果你现在不太能理解，那就先编程吧，尤其工作中被师兄师姐们的代码调教下，再回头看！***

> 七大法则：**<u>*单一职责、开闭、里氏替换、依赖倒转、接口隔离、合成复用、迪米特法则。*</u>**

遵守设计原则的目的：实现软件的<u>可维护性</u>和<u>可复用性</u>。



1.单一职责原则：

​	类的**职责要单一**，不能将太多的职责放在一个类中。

2.开闭原则：

​	软件实体对**扩展是开放**的，但对**修改是关闭**的，即在不修改一个软件实体的基础上去扩展其功能。

3.里氏代换原则：

​	在软件系统中，一个可以**接受基类对象**的地方必然可以接受一个子类对象。

4.依赖倒转原则：

​	要针对**抽象层编程**，而不要针对具体类编程。

5.接口隔离原则：

​	使用**多个专门的接口**来取代一个统一的接口。

6.合成复用原则：

​	在系统中应该尽量**多使用组合和聚合关联关系**，尽量**少使用**甚至**不使用继承关系**。

7.迪米特法则：

​	一个软件实体对其他实体的引用越少越好，或者说如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用，而是通过引入一个第三者发生间接交互。**有点中间加一层的意思**。











