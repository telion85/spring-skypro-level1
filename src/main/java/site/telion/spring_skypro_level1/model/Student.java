package site.telion.spring_skypro_level1.model;

import lombok.Data;

@Data
public abstract class Student {
    private String name;
    private Integer magicPower;
    private Integer transgressionDistance;

    public Student(String name, Integer magicPower, Integer transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

}
