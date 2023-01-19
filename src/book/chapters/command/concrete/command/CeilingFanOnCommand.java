package book.chapters.command.concrete.command;

import book.chapters.command.concrete.receiver.CeilingFan;
import book.chapters.command.idea.Command;

public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
        ceilingFan.setSpeed(CeilingFan.Speed.HIGH);
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
