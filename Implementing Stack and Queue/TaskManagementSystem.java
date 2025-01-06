public class TaskManagementSystem {
   
    private QueueAsMyLinkedList<String> taskQueue;
    private StackAsMyLinkedList<String> undoStack;

    public TaskManagementSystem() {
        taskQueue = new QueueAsMyLinkedList<>();
        undoStack = new StackAsMyLinkedList<>();
    }

    public void addTask(String task) {
        taskQueue.enqueue(task);
        System.out.println("Added task: " + task);
    }

    public void processNextTask() {
        if(!taskQueue.isEmpty()) {
            String task = taskQueue.dequeue();
            System.out.println("Processing task: " + task);
            undoStack.push(task);
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void undoLastTask() {
        if(!undoStack.isEmpty()) {
          String task = undoStack.pop();
          System.out.println("Undoing task: " + task);
    } else {
        System.out.println("No tasks to undo.");
    }
  }

  public void printTasks() {
    System.out.println("Current tasks in queue: " + taskQueue.toString());
  }

  public void printUndoStack() {
    System.out.println("Undo stack: " + undoStack.toString());
  }
}
