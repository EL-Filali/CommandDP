package beans.devices.implementations;

import beans.devices.Device;
import lombok.Data;

@Data
public  abstract class DeviceImp implements Device {
    public String deviceName;

    public DeviceImp(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void turnOff() {
        System.out.println(deviceName+" Turned OFF");
    }

    @Override
    public void turnOn() {
        System.out.println(deviceName+" Turned ON");
    }

    @Override
    public String info() {
        return deviceName;
    }
}
