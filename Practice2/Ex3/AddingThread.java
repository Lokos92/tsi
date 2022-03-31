package Ex3;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread{
    BlockingQueue queue;

    public AddingThread(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            queue.add("Element" + i);

            System.out.println("The element Element" + i + " has been added to the queue");
        }
    }
}
