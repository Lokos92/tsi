package Ex2;

public class TaskThread extends Thread{
    int taskId;
    TaskManager taskManager;

    public TaskThread(String name, int taskId, TaskManager taskManager) {
        super(name);
        this.taskId = taskId;
        this.taskManager = taskManager;
    }

    @Override
    public void run() {
        TaskManager taskManager = new TaskManager();
        taskManager.performTask(taskId, getName());
    }
}
