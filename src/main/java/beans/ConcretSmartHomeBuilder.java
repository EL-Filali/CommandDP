package beans;

import java.security.cert.CertPathBuilder;

public class ConcretSmartHomeBuilder {
    String name;
    Integer id;
    Adresse adresse;
    RemoteControl remoteControl;
    public ConcretSmartHomeBuilder(String name, int id) {
        this.name=name;
        this.id=id;
    }

    public ConcretSmartHomeBuilder withAdresse(Adresse adresse) {
        this.adresse=adresse;
        return this;
    }

    public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
        this.remoteControl=remoteControl;
        return this;
    }

    public SmartHome build() {
        return new SmartHome(name,id,adresse,remoteControl);
    }
}
