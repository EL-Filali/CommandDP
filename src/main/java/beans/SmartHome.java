package beans;

import lombok.Data;

@Data
public class SmartHome {
    String name;
    Integer id;
    Adresse adresse;
    RemoteControl remoteControl;

    public SmartHome(String name, Integer id, Adresse adresse, RemoteControl remoteControl) {
        this.name = name;
        this.id = id;
        this.adresse = adresse;
        this.remoteControl = remoteControl;
    }

    public String report() {
        return remoteControl.getReport();
    }

    /*public String report() {

    }*/
}
