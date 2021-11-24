package beans.commands.implementations;

import beans.commands.Command;
import beans.devices.Device;

public class TurnOnCommand extends Command {
    public TurnOnCommand(Device device) {
        super(device);
    }

    @Override
    public void undo() {
        System.out.print("UNDO");
        device.turnOff();

    }

    @Override
    public String info() {
        return device.info()+" On";
    }

    @Override
    public void execute() {
        System.out.print("EXECUTE ");
        device.turnOn() ;
    }
}
