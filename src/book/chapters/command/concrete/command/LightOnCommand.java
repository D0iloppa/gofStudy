package book.chapters.command.concrete.command;

import book.chapters.command.concrete.receiver.Light;
import book.chapters.command.idea.Command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
