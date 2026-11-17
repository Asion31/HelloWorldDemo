// Cat类：和Dog结构类似，但行为不同（猫喵叫、会抓老鼠）
public class Cat {
    String name;
    String color;
    int age;

    public void meow() {
        System.out.println(name + ": 喵喵喵~");
    }

    public void catchMouse() {
        System.out.println(name + " 抓住了一只老鼠！");
    }

    public void showInfo() {
        System.out.println("【猫】名字=" + name + "，毛色=" + color + "，年龄=" + age);
    }
}
