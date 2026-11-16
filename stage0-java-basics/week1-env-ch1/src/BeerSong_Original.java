// Head First Java 原版代码，存在单复数残留bug
public class BeerSong_Original {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // 单数瓶子
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                // bug点：此时word还是"bottle"，但输出写死bottles，逻辑不一致
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
