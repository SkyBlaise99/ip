public class Parser {
    /**
     * Interprets the command entered by user.
     *
     * @param command command to be interpreted
     * @throws DukeException if user inputs invalid command
     */
    public static CheckedFunction interpretCommand(String command) throws DukeException {
        // Each if else handles one type of command
        if (command.equals("list")) {
            return TaskList::printFullList;
        } else if (command.matches("^done( .*)?")) {
            return (tasks) -> tasks.taskDone(command);
        } else if (command.matches("^todo( .*)?")) {
            return (tasks) -> tasks.addTodo(command);
        } else if (command.matches("^deadline( .*)?")) {
            return (tasks) -> tasks.addDeadline(command);
        } else if (command.matches("^event( .*)?")) {
            return (tasks) -> tasks.addEvent(command);
        } else if (command.matches("^delete( .*)?")) {
            return (tasks) -> tasks.taskDelete(command);
        } else {
            throw new UnknownCommandException();
        }
    }
}

interface CheckedFunction {
    String execute(TaskList t) throws DukeException;
}
