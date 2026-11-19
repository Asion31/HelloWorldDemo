package basic.day1;

/**
 * Head-First Java 第3章 Dog范例
 * 知识点：引用变量、对象数组、栈和堆、null引用
 * 1. 创建Dog对象，给成员变量name赋值
 * 2. 创建Dog类型数组，数组里面存的是Dog对象的引用（不是对象本身）
 * 3. 数组元素可以指向同一个对象（myDogs[2] = dog1，引用同一个对象）
 * 4. 没有赋值的数组元素默认是null，调用方法会空指针
 */
public class Dog {
    String name;

    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void chaseCat() {
        System.out.println("chasing cat...");
    }

    public static void main(String[] args) {
        // 创建Dog对象
        Dog dog1 = new Dog();
        dog1.bark();//空指针
        dog1.name = "Bart";

        // 创建Dog数组，数组长度3，此时里面3个元素全是null
        Dog[] myDogs = new Dog[3];

        // 给数组前两个位置分配新Dog对象
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        // 让数组第3个元素 和 dog1 指向同一个对象
        myDogs[2] = dog1;

        // 通过数组引用给对象name赋值
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // myDogs[2] 和 dog1 是同一个对象，名字是Bart
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        // 循环逐个调用bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            myDogs[x].eat();
            myDogs[x].chaseCat();
            x = x + 1;
        }


    }
}
