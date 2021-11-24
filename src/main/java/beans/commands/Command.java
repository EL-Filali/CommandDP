package beans.commands;

import beans.devices.Device;

public abstract  class Command {
    protected Device device;

    public Command(Device device) {
        this.device = device;
    }

    public abstract void execute() ;
    public abstract void undo();
    public abstract String info();

}
