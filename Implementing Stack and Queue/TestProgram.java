public class TestProgram {
    public static void main(String[] args) {
        TaskManagementSystem taskManager = new TaskManagementSystem();

        taskManager.addTask("Task 1");
        taskManager.addTask("Task 2");
        taskManager.addTask("Task 3");

        taskManager.printTasks();

        taskManager.processNextTask();
        taskManager.processNextTask();

        taskManager.printTasks();
        taskManager.printUndoStack();

        taskManager.undoLastTask();

        taskManager.processNextTask();
        taskManager.printTasks();

        taskManager.undoLastTask();
        taskManager.undoLastTask();
    }
}
