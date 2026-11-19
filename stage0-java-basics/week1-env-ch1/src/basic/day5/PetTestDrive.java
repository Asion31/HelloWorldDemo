package basic.day5;

// 测试类：创建Dog和Cat对象，给它们赋值，调用它们的方法
public class PetTestDrive {
    public static void main(String[] args) {
        // ---- 创建Dog对象 ----
        Dog myDog = new Dog();
        myDog.name = "豆豆";
        myDog.breed = "泰迪";
        myDog.age = 2;

        myDog.showInfo();
        myDog.bark();
        myDog.eat("骨头");

        System.out.println("-------------------");

        // ---- 创建Cat对象 ----
        Cat myCat = new Cat();
        myCat.name = "花花";
        myCat.color = "三花";
        myCat.age = 1;

        myCat.showInfo();
        myCat.meow();
        myCat.catchMouse();
    }
}
