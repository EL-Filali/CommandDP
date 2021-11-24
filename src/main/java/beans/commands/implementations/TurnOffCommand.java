package beans.commands.implementations;

import beans.commands.Command;
import beans.devices.Device;

public class TurnOffCommand extends Command {
    public TurnOffCommand(Device device) {
        super(device);
    }

    @Override
    public void execute() {
        System.out.print("EXECUTE ");

        device.turnOff();
    }

    @Override
    public void  undo() {
        System.out.print("UNDO  " );
        device.turnOn();
    }

    @Override
    public String info() {
        return device.info()+" Off";
    }


}
