// 改良修复版：解决原版word变量状态残留的bug
// 问题根源：word定义在while循环外面，循环迭代后旧值会保留下来
public class BeerSong_Fixed {
    public static void main(String[] args) {
        int beerNum = 99;

        while (beerNum > 0) {
            // 每一轮循环内部重新计算单复数，不使用循环外的残留变量
            String word = beerNum == 1 ? "bottle" : "bottles";

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");

            beerNum = beerNum - 1;

            if (beerNum > 0) {
                String nextWord = beerNum == 1 ? "bottle" : "bottles";
                System.out.println(beerNum + " " + nextWord + " of beer on the wall\n");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
