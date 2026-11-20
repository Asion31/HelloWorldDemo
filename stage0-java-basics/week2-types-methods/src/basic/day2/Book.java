package basic.day2;

/**
 * 引用变量、对象数组练习 Book范例
 * 知识点：引用变量、对象数组、同一个对象多引用、null引用、空指针风险
 * 1. 创建Book对象，成员变量bookName默认值为null
 * 2. 创建Book类型数组，数组存储的是Book对象引用，不是对象本身
 * 3. 数组元素可以直接指向已经存在的对象（books[2] = b1，共用同一个对象）
 * 4. 未手动赋值的数组元素默认是null，直接调用方法会触发空指针异常
 */
public class Book {
    String bookName;

    public void showInfo() {
        System.out.println("书名：" + bookName);
    }

    public static void main(String[] args) {
        // 创建Book对象
        Book b1 = new Book();
        b1.showInfo();
        b1.bookName = "java入门";

        // 创建Book数组，长度4，初始全部元素都是null
        Book[] books = new Book[4];
        // 给数组前两个位置新建Book对象
        books[0] = new Book();
        books[1] = new Book();
        // 让books[2]和b1指向同一个对象
        books[2] = b1;

        // 通过数组引用修改书名
        books[0].bookName = "数据结构";
        books[1].bookName = "计算机网络";

        int i = 0;
        while (i < books.length) {
            // 增加判断，避免null调用方法报空指针
            if (books[i] != null) {
                books[i].showInfo();
            } else {
                System.out.println("当前位置是null");
            }
            i++;
        }
    }
}

