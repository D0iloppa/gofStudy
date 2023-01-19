package book.chapters.command.concrete;

import book.chapters.command.concrete.command.NoCommand;
import book.chapters.command.idea.Command;

public class RemoteControl {

    private int buttonSize;

    private int top;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(int buttonSize) {
        if(buttonSize<1) {
            System.out.println("버튼의 갯수는 최소한 한개 이상이어야 합니다. 최소의 갯수로 생성합니다.");
            buttonSize = 1;
        }

        this.buttonSize = buttonSize;
        this.top = 0;

        onCommands = new Command[buttonSize];
        offCommands = new Command[buttonSize];

        // 비어있는 command
        Command noCommand = new NoCommand();

        for(int i=0 ; i < buttonSize ; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void pushCommand(Command onCommand, Command offCommand){
        if(!isValidSlot(top)) return;
        onCommands[top] = onCommand;
        offCommands[top] = offCommand;

        top++;

    }

    public int getTopSlotIndex(){
        return this.top;
    }

    public void setCommand(int slot,Command onCommand, Command offCommand){
        if(!isValidSlot(slot)) return;
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        if(!isValidSlot(slot)) return;
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        if(!isValidSlot(slot)) return;
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    };

    public boolean isValidSlot(int slot){
        boolean chk = (slot < 0 || slot >= this.buttonSize) ? false : true;
        if(!chk)  System.out.println("잘못된 슬롯입니다. 작업을 수행할 수 없습니다.");

        return chk;
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- 리모컨 -----\n");

        for(int i=0 ; i < this.buttonSize ; i++){
            String append = String.format("[slot #%d] ON : %s | OFF : %s" , (i+1) , onCommands[i].getClass().getSimpleName() , offCommands[i].getClass().getSimpleName());
            stringBuffer.append(append + "\n");
        }
        String append = String.format("[undo slot] %s",undoCommand.getClass().getSimpleName());
        stringBuffer.append(append + "\n");

        return stringBuffer.toString();
    }

}
