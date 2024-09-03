import java.util.Scanner;

public class Ui {
    private final String line = "____________________________________________________________";

    public void showWelcomeMessage() {
        System.out.println(line);
        System.out.println(" Hello! I'm Sammy.");
        System.out.println(" What can I do for you?");
        System.out.println(line);
    }

    public void showGoodbyeMessage() {
        System.out.println(line);
        System.out.println(" Bye. Hope to see you again soon!");
        System.out.println(line);
    }

    public void showLine() {
        System.out.println(line);
    }

    public void showErrorMessage(String message) {
        System.out.println(line);
        System.out.println(" OOPS!!! " + message);
        System.out.println(line);
    }

    public void showTaskList(TaskList tasks) {
        System.out.println(line);
        System.out.println(" Here are the tasks in your list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(" " + (i + 1) + "." + tasks.get(i));
        }
        System.out.println(line);
    }

    public void showAddTask(Task task, int size) {
        System.out.println(line);
        System.out.println(" Got it. I've added this task:");
        System.out.println(" " + task);
        System.out.println(" Now you have " + size + " tasks in the list.");
        System.out.println(line);
    }

    public void showRemoveTask(Task task, int size) {
        System.out.println(line);
        System.out.println(" Noted. I've removed this task:");
        System.out.println(" " + task);
        System.out.println(" Now you have " + size + " tasks in the list.");
        System.out.println(line);
    }

    public String readCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

