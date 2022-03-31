package Ex4;

import java.util.Random;

public class Consumer extends Thread{
    final Goods goods;
    Random random = new Random();

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        var goods = random.nextInt(2147483647);

        System.out.println("Consumed: " + goods);
    }
}
