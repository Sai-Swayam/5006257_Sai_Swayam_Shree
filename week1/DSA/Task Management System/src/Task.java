public class Task {
    int taskId;
    String taskName;
    boolean status;

    Task next;

    public Task(int taskId, String taskName, boolean status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public String toString() {
        return taskId + ") " + taskName + " |status: " + status;
    }
}
