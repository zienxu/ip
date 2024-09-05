package sammy.command;

import sammy.Storage;
import sammy.task.TaskList;
import sammy.Ui;
import sammy.task.Task;

import java.io.IOException;

public class AddCommand extends Command {
    private Task task;

    public AddCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws IOException {
        tasks.add(task);
        ui.showAddTask(task, tasks.size());
        storage.save(tasks);
    }
}


