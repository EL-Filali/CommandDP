package beans;

import beans.commands.Command;
import beans.commands.implementations.TurnOnCommand;
import beans.commands.implementations.TurnOffCommand;

import beans.devices.Device;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Data
public class RemoteControl {
    Integer nbrSlot;
    Command [] onCommands;
    Command [] offCommands;

    Stack<Command> executedCommands;
    public RemoteControl(Integer nbrSlot) {
        onCommands=new Command[nbrSlot];
        offCommands=new Command[nbrSlot];
        this.nbrSlot = nbrSlot;
        executedCommands=new Stack<>();
    }

    public void init(Device ...devices){
        for(int i=0;i<devices.length;i++){
            this.onCommands[i]=new TurnOnCommand(devices[i]);
            this.offCommands[i]=new TurnOffCommand(devices[i]);
        }

    }

    public void onButtonPressed(int id) {
        this.onCommands[id].execute();
        executedCommands.push(this.onCommands[id]);
    }

    public void offButtonPressed(int id) {
        this.offCommands[id].execute();
        executedCommands.push(this.offCommands[id]);
    }

    public void undo(){
        executedCommands.pop().undo();
    }

    public String getReport() {
        StringBuilder builder=new StringBuilder();
        for(Command command:executedCommands ){
            builder.append(command.info()+"-");
        }
        return builder.toString();
    }
}
