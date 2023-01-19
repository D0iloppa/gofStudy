package book.chapters.command.idea;

public interface Command {
    public void execute();
    public void undo();
}
