package bongo.command;

import bongo.helper.Storage;
import bongo.helper.Ui;
import bongo.task.TaskList;

/**
 * A class for a ExitCommand.
 */
public class ExitCommand extends Command {

    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        return ui.showGoodbye();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
