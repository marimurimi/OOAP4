package sample;

import java.util.Stack;

public class RemoteControl {
    Command[] onCom;
    Command[] offCom;

    Stack<Command> undoCom;

    public RemoteControl() {
        this.onCom = new Command[2];
        this.offCom = new Command[2];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 2; i++) {
            onCom[i] = noCommand;
            offCom[i] = noCommand;
        }

        this.undoCom = new Stack<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCom[slot] = onCommand;
        offCom[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCom[slot].execute();
        undoCom.push(onCom[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCom[slot].execute();
        undoCom.push(offCom[slot]);
    }

    public void undoButtonWasPushed( ) {
         {

            undoCom.pop().undo();
        }
    }


    @Override
    public String toString() {
        String str = new String("");
        str += "\n--------RemoteControl--------\n";

        for (int i = 0; i < onCom.length; i++) {
            str += "[slot " + i + "] " + onCom[i].getClass().getName().substring(onCom[i].getClass().getName().lastIndexOf('.')) +
                    " " + offCom[i].getClass().getName().substring(offCom[i].getClass().getName().lastIndexOf('.')) + "\n";
        }
        return str;
    }
}
