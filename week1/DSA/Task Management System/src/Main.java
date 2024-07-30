public class Main {
    public static void main(String[] args) {
        TaskLinkedList tasks = new TaskLinkedList();
        tasks.addTask(new Task(1,"Study",false));
        tasks.addTask(new Task(2,"Finish Cognizant tasks",false));
        tasks.addTask(new Task(3,"Sleep",true));
        tasks.addTask(new Task(4,"Eat",true));

        tasks.traverse();

        tasks.deleteTask(3);
        tasks.traverse();
    }
}