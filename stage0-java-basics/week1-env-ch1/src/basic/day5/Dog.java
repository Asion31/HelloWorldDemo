package basic.day5;

// Dog类：封装狗的状态（名字、品种、年龄）和行为（叫、吃东西）
public class Dog {
    // 实例变量（状态）：每个对象各自有一份
    String name;
    String breed;
    int age;

    // 方法（行为）：狗会叫
    public void bark() {
        System.out.println(name + ": 汪汪汪！");
    }

    // 方法：狗会吃东西，带参数
    public void eat(String food) {
        System.out.println(name + " 在吃 " + food);
    }

    // 方法：打印狗的完整信息
    public void showInfo() {
        System.out.println("【狗】名字=" + name + "，品种=" + breed + "，年龄=" + age);
    }
}
