
package sammy.command;

import sammy.task.TaskList;
import sammy.Ui;
import sammy.SammyException;
import sammy.Storage;
import java.io.IOException;
import sammy.task.Task;
import sammy.exceptions.InvalidTaskNumberException;

public class DeleteCommand extends Command {
    private int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws SammyException, IOException {
        if (index < 0 || index >= tasks.size()) {
            throw new InvalidTaskNumberException();
        }
        Task removedTask = tasks.remove(index);
        ui.showRemoveTask(removedTask, tasks.size());
        storage.save(tasks);
    }
}

