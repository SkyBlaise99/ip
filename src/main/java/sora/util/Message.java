package sora.util;

/**
 * Stores the messages which UI uses to print.
 *
 * @author Zhang Shi Chen
 */
public enum Message {
    HORIZONTAL_LINE("\t____________________________________________________________\n"),
    WELCOME("Hi! I'm Sora. How can I help you?"),
    EXIT("Have a nice day! Good bye XD"),
    DONE("Congrats! You have accomplished the following task:"),
    ADD("Alright, new task added to the list:"),
    DELETE("Sure, I've deleted this task:"),
    LIST("Here are the tasks in your list:"),
    HELP("Name: Sora\n"
        + "Version: The creator lost count...\n"
        + "Supported Features: help, list, todo, deadline, event, done, delete, find");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
