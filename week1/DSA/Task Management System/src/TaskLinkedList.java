public class TaskLinkedList {
    Task head = null;

    public void addTask(Task t) {
        if (head == null)
            head = t;
        else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = t;
            t.next = null;
        }
        System.out.println("Task added successfully");
    }

    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("There are no tasks to be deleted.");
            return;
        }
        Task temp = head;
        while (temp.next.taskId != id) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        System.out.println("Deleted node successfully");
    }

    public void traverse() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

}
