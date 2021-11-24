package beans;

import lombok.Data;

@Data
public class Adresse {
    private Integer  codePostale;
    private String cityName;

    public Adresse(Integer codePostale, String cityName) {
        this.codePostale = codePostale;
        this.cityName = cityName;
    }

    public Adresse() {
    }
}
