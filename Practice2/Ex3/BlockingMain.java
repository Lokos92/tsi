package Ex3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingMain {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        AddingThread addingThread = new AddingThread(queue);
        TakingThread takingThread = new TakingThread(queue);

        addingThread.start();
        takingThread.start();
    }
}
