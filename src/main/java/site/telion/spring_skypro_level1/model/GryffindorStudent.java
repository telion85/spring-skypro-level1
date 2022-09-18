package site.telion.spring_skypro_level1.model;

import lombok.Data;

@Data
public class GryffindorStudent extends Student {
    private Integer nobility;
    private Integer honour;
    private Integer bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
}
