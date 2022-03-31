package Ex2;

public class SyncMain {
    public static void main(String[] args) {
        final TaskManager taskManager = new TaskManager();
        TaskThread thread1 = new TaskThread("Alpha", 1, taskManager);
        TaskThread thread2 = new TaskThread("Gamma", 2, taskManager);

        thread1.start();
        thread2.start();
    }
}
